package com.gradeadminsystrem.bean;

import java.util.Date;

public class User {
	private Long id;
	private String username;
	private String password;
	private int  status;
	private String name;
	private String email;
	private String mobile;
	private String idcard;
	private Date addtime;
	private Date modifytime;
	private Long addby;
	private Long modifyby;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Long getAddby() {
		return addby;
	}
	public void setAddby(Long addby) {
		this.addby = addby;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Long getModifyby() {
		return modifyby;
	}
	public void setModifyby(Long modifyby) {
		this.modifyby = modifyby;
	}
	public Date getModifytime() {
		return modifytime;
	}
	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", status=" + status + ", name=" + name
				+ ", email=" + email + ", mobile=" + mobile + ", idcard="
				+ idcard + ", addtime=" + addtime + ", modifytime="
				+ modifytime + ", addby=" + addby + ", modifyby=" + modifyby
				+ "]";
	}
	
	
}
