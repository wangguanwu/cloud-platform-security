package com.github.guanwu.security.modules.auth.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 18:11:14
 */
@Table(name = "auth_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //服务编码
    @Column(name = "code")
    private String code;
	
	    //服务密钥
    @Column(name = "secret")
    private String secret;
	
	    //服务名
    @Column(name = "name")
    private String name;
	
	    //是否锁定
    @Column(name = "locked")
    private String locked;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //创建人
    @Column(name = "crt_user")
    private String crtUser;
	
	    //创建人姓名
    @Column(name = "crt_name")
    private String crtName;
	
	    //创建主机
    @Column(name = "crt_host")
    private String crtHost;
	
	    //更新时间
    @Column(name = "upd_time")
    private Date updTime;
	
	    //更新人
    @Column(name = "upd_user")
    private String updUser;
	
	    //更新姓名
    @Column(name = "upd_name")
    private String updName;
	
	    //更新主机
    @Column(name = "upd_host")
    private String updHost;
	
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
	 * 设置：服务编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：服务编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：服务密钥
	 */
	public void setSecret(String secret) {
		this.secret = secret;
	}
	/**
	 * 获取：服务密钥
	 */
	public String getSecret() {
		return secret;
	}
	/**
	 * 设置：服务名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：服务名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：是否锁定
	 */
	public void setLocked(String locked) {
		this.locked = locked;
	}
	/**
	 * 获取：是否锁定
	 */
	public String getLocked() {
		return locked;
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
	 * 设置：创建时间
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * 设置：创建人姓名
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * 获取：创建人姓名
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * 设置：创建主机
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * 获取：创建主机
	 */
	public String getCrtHost() {
		return crtHost;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdTime() {
		return updTime;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * 设置：更新姓名
	 */
	public void setUpdName(String updName) {
		this.updName = updName;
	}
	/**
	 * 获取：更新姓名
	 */
	public String getUpdName() {
		return updName;
	}
	/**
	 * 设置：更新主机
	 */
	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}
	/**
	 * 获取：更新主机
	 */
	public String getUpdHost() {
		return updHost;
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
