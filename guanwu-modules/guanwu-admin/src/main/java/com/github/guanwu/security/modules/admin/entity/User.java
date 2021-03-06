package com.github.guanwu.security.modules.admin.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author guanwu
 * @email 2014314038@qq.com
 * @version 2021-07-31 17:58:53
 */
@Table(name = "base_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "username")
    private String username;
	
	    //
    @Column(name = "password")
    private String password;
	
	    //
    @Column(name = "name")
    private String name;
	
	    //
    @Column(name = "birthday")
    private String birthday;
	
	    //
    @Column(name = "address")
    private String address;
	
	    //
    @Column(name = "mobile_phone")
    private String mobilePhone;
	
	    //
    @Column(name = "tel_phone")
    private String telPhone;
	
	    //
    @Column(name = "email")
    private String email;
	
	    //
    @Column(name = "sex")
    private String sex;
	
	    //
    @Column(name = "type")
    private String type;
	
	    //
    @Column(name = "status")
    private String status;
	
	    //
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
    @Column(name = "upd_time")
    private Date updTime;
	
	    //
    @Column(name = "upd_user")
    private String updUser;
	
	    //
    @Column(name = "upd_name")
    private String updName;
	
	    //
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
	 * ?????????
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * ?????????
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * ?????????
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * ?????????
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * ?????????
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ?????????
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * ?????????
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * ?????????
	 */
	public String getName() {
		return name;
	}
	/**
	 * ?????????
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * ?????????
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * ?????????
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * ?????????
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * ?????????
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * ?????????
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * ?????????
	 */
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	/**
	 * ?????????
	 */
	public String getTelPhone() {
		return telPhone;
	}
	/**
	 * ?????????
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * ?????????
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * ?????????
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * ?????????
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * ?????????
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * ?????????
	 */
	public String getType() {
		return type;
	}
	/**
	 * ?????????
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * ?????????
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * ?????????
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * ?????????
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * ?????????
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * ?????????
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * ?????????
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * ?????????
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * ?????????
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * ?????????
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * ?????????
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * ?????????
	 */
	public String getCrtHost() {
		return crtHost;
	}
	/**
	 * ?????????
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	/**
	 * ?????????
	 */
	public Date getUpdTime() {
		return updTime;
	}
	/**
	 * ?????????
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * ?????????
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * ?????????
	 */
	public void setUpdName(String updName) {
		this.updName = updName;
	}
	/**
	 * ?????????
	 */
	public String getUpdName() {
		return updName;
	}
	/**
	 * ?????????
	 */
	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}
	/**
	 * ?????????
	 */
	public String getUpdHost() {
		return updHost;
	}
	/**
	 * ?????????
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * ?????????
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * ?????????
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * ?????????
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * ?????????
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	/**
	 * ?????????
	 */
	public String getAttr3() {
		return attr3;
	}
	/**
	 * ?????????
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	/**
	 * ?????????
	 */
	public String getAttr4() {
		return attr4;
	}
	/**
	 * ?????????
	 */
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	/**
	 * ?????????
	 */
	public String getAttr5() {
		return attr5;
	}
	/**
	 * ?????????
	 */
	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}
	/**
	 * ?????????
	 */
	public String getAttr6() {
		return attr6;
	}
	/**
	 * ?????????
	 */
	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}
	/**
	 * ?????????
	 */
	public String getAttr7() {
		return attr7;
	}
	/**
	 * ?????????
	 */
	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}
	/**
	 * ?????????
	 */
	public String getAttr8() {
		return attr8;
	}
}
