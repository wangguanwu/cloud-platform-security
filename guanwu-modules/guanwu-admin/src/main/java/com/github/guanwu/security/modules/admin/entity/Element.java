package com.github.guanwu.security.modules.admin.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 18:10:18
 */
@Table(name = "base_element")
public class Element implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //资源编码
    @Column(name = "code")
    private String code;
	
	    //资源类型
    @Column(name = "type")
    private String type;
	
	    //资源名称
    @Column(name = "name")
    private String name;
	
	    //资源路径
    @Column(name = "uri")
    private String uri;
	
	    //资源关联菜单
    @Column(name = "menu_id")
    private String menuId;
	
	    //
    @Column(name = "parent_id")
    private String parentId;
	
	    //资源树状检索路径
    @Column(name = "path")
    private String path;
	
	    //资源请求类型
    @Column(name = "method")
    private String method;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //
    @Column(name = "crt_user")
    private String crtUser;
	
	    //
    @Column(name = "crt_name")
    private String crtName;
	
	    //
    @Column(name = "crt_host")
    private String crtHost;
	
	    //
    @Column(name = "attr1")
    private String attr1;
	
	    //
    @Column(name = "attr2")
    private String attr2;
	
	    //
    @Column(name = "attr3")
    private String attr3;
	
	    //
    @Column(name = "attr4")
    private String attr4;
	
	    //
    @Column(name = "attr5")
    private String attr5;
	
	    //
    @Column(name = "attr6")
    private String attr6;
	
	    //
    @Column(name = "attr7")
    private String attr7;
	
	    //
    @Column(name = "attr8")
    private String attr8;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：资源编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：资源编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：资源类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：资源类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：资源名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：资源名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：资源路径
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
	/**
	 * 获取：资源路径
	 */
	public String getUri() {
		return uri;
	}
	/**
	 * 设置：资源关联菜单
	 */
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	/**
	 * 获取：资源关联菜单
	 */
	public String getMenuId() {
		return menuId;
	}
	/**
	 * 设置：
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：资源树状检索路径
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：资源树状检索路径
	 */
	public String getPath() {
		return path;
	}
	/**
	 * 设置：资源请求类型
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	/**
	 * 获取：资源请求类型
	 */
	public String getMethod() {
		return method;
	}
	/**
	 * 设置：描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取：
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置：
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * 获取：
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * 设置：
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * 获取：
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * 设置：
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * 获取：
	 */
	public String getCrtHost() {
		return crtHost;
	}
	/**
	 * 设置：
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * 获取：
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * 设置：
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * 获取：
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * 设置：
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	/**
	 * 获取：
	 */
	public String getAttr3() {
		return attr3;
	}
	/**
	 * 设置：
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	/**
	 * 获取：
	 */
	public String getAttr4() {
		return attr4;
	}
	/**
	 * 设置：
	 */
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	/**
	 * 获取：
	 */
	public String getAttr5() {
		return attr5;
	}
	/**
	 * 设置：
	 */
	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}
	/**
	 * 获取：
	 */
	public String getAttr6() {
		return attr6;
	}
	/**
	 * 设置：
	 */
	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}
	/**
	 * 获取：
	 */
	public String getAttr7() {
		return attr7;
	}
	/**
	 * 设置：
	 */
	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}
	/**
	 * 获取：
	 */
	public String getAttr8() {
		return attr8;
	}
}
