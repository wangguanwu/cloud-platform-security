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
@Table(name = "gate_log")
public class GateLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //序号
    @Id
    private Integer id;
	
	    //菜单
    @Column(name = "menu")
    private String menu;
	
	    //操作
    @Column(name = "opt")
    private String opt;
	
	    //资源路径
    @Column(name = "uri")
    private String uri;
	
	    //操作时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //操作人ID
    @Column(name = "crt_user")
    private String crtUser;
	
	    //操作人
    @Column(name = "crt_name")
    private String crtName;
	
	    //操作主机
    @Column(name = "crt_host")
    private String crtHost;
	
	    //
    @Column(name = "body")
    private String body;
	

	/**
	 * 设置：序号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：序号
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：菜单
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}
	/**
	 * 获取：菜单
	 */
	public String getMenu() {
		return menu;
	}
	/**
	 * 设置：操作
	 */
	public void setOpt(String opt) {
		this.opt = opt;
	}
	/**
	 * 获取：操作
	 */
	public String getOpt() {
		return opt;
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
	 * 设置：操作时间
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取：操作时间
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置：操作人ID
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * 获取：操作人ID
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * 设置：操作人
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * 获取：操作人
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * 设置：操作主机
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * 获取：操作主机
	 */
	public String getCrtHost() {
		return crtHost;
	}
	/**
	 * 设置：
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * 获取：
	 */
	public String getBody() {
		return body;
	}
}
