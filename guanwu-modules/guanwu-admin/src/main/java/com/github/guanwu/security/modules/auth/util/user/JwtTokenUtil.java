package com.github.guanwu.security.modules.auth.util.user;

import com.github.guanwu.security.common.util.jwt.IJWTInfo;
import com.github.guanwu.security.common.util.jwt.JwtHelper;
import com.github.guanwu.security.configuration.KeyConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author guanwu
 * @created on 2021-08-10 12:02:43
 **/

@Component
public class JwtTokenUtil {

    @Value("${jwt.expire}")
    private int expire;

    private final KeyConfiguration keyConfiguration;

    private final RedisTemplate<String, Object> redisTemplate;

    public JwtTokenUtil(KeyConfiguration keyConfiguration, RedisTemplate<String, Object> redisTemplate) {
        this.keyConfiguration = keyConfiguration;
        this.redisTemplate = redisTemplate;
    }

    public String generateToken(IJWTInfo jwtInfo) throws Exception {
        return JwtHelper.generateToken(jwtInfo, keyConfiguration.getUserPriKey(), expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JwtHelper.getInfoFromToken(token, keyConfiguration.getUserPubKey());
    }
}
