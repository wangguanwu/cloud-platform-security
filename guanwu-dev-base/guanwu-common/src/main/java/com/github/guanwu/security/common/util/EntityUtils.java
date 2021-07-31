package com.github.guanwu.security.common.util;

import com.github.guanwu.security.common.context.BaseContextHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Objects;

/**
 * 实体相关工具类
 *  解决问题： 1、快速对实体的常驻字段，如：crtUser、crtHost、updUser等值快速注入
 *
 * @author guanwu
 * @created on 2021-07-30 16:53:37
 **/
public class EntityUtils {

    private static final Logger logger = LoggerFactory.getLogger(EntityUtils.class);

    /**
     * 快速将bean的crtUser、crtHost、crtTime、updUser、updHost、updTime附上相关值
     *
     * @param entity 实体bean
     */
    public static <T> void setCreatAndUpdatInfo(T entity) {
        setCreateInfo(entity);
        setUpdatedInfo(entity);
    }

    /**
     * 快速将bean的crtUser、crtHost、crtTime附上相关值
     *
     * @param entity 实体bean
     * @author guanwu
     */
    public static <T> void setCreateInfo(T entity) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String hostIp = "";
        String name = "";
        String id = "";
        if (!Objects.isNull(request)) {
            hostIp = StringUtils.defaultIfBlank(request.getHeader("UserHost"), ClientUtil.getClientIp(request));
            try {
                name = URLEncoder.encode(StringUtils.trim(request.getHeader("userName")),
                        StandardCharsets.UTF_8.name());
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
            id = StringUtils.trimToEmpty(request.getHeader("userId"));
        }
        if (StringUtils.isBlank(name)) {
            name = BaseContextHandler.getUsername();
        }
        if (StringUtils.isBlank(id)) {
            id = BaseContextHandler.getUserID();
        }
        // 默认属性
        String[] fields = {"crtName", "crtUser", "crtHost", "crtTime"};
        Field field = ReflectionUtils.getAccessibleField(entity, "crtTime");
        Object[] value = null;
        if (!Objects.isNull(field) && Objects.equals(field.getType(), Date.class)) {
            value = new Object[]{name, id, hostIp, new Date()};
        }
        //填充默认属性值
        setDefaultValues(entity, fields, value);

    }

    /**
     * 快速将bean的updUser、updHost、updTime附上相关值
     * @param entity
     * @param <T>
     */
    public static <T> void setUpdatedInfo(T entity){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String hostIp = "";
        String name = "";
        String id = "";
        hostIp = StringUtils.defaultIfBlank(request.getHeader("userHost"), ClientUtil.getClientIp(request));
        name = StringUtils.trimToEmpty(request.getHeader("userName"));
        try {
            name = URLDecoder.decode(name, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        id = StringUtils.trimToEmpty(request.getHeader("userId"));

        if (StringUtils.isBlank(name)) {
            name = BaseContextHandler.getUsername();
        }
        if (StringUtils.isBlank(id)) {
            id = BaseContextHandler.getUserID();
        }

        // 默认属性
        String []fields = {"updName","updUser","updHost","updTime"};
        Field field = ReflectionUtils.getAccessibleField(entity, "updTime");
        Object []value = null;
        if (Objects.nonNull(field) && Objects.equals(field.getType(), Date.class)) {
            value = new Object []{name, id, hostIp, new Date()};
        }
        // 填充默认属性值
        setDefaultValues(entity, fields, value);
    }

    /**
     * 快速将bean的updUser、updHost、updTime附上相关值
     *
     * @param entity
     * @param fields
     * @param value
     * @param <T>
     */
    private static <T> void setDefaultValues(T entity, String[] fields, Object[] value) {
        for (int i = 0; i < fields.length; i++) {
            String field = fields[i];
            if (ReflectionUtils.hasField(entity, field)) {
                ReflectionUtils.invokeSetter(entity, field, value[i]);
            }
        }
    }

    /**
     * 根据主键属性，判断主键是否值为空
     *
     * @param entity
     * @param field
     * @param <T>
     * @return
     */
    public static <T> boolean isPkNotNull(T entity, String field) {
        if (!ReflectionUtils.hasField(entity, field)) {
            return false;
        }
        Object value = ReflectionUtils.getFieldValue(entity, field);
        if ((value instanceof String) && StringUtils.isNotBlank((String) value)) {
            return true;
        }
        return Objects.nonNull(value);
    }
}
