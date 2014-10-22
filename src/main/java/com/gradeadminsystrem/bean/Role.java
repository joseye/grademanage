package com.gradeadminsystrem.bean;

import java.util.Date;

public class Role {
	private Long id;
	private String rolename;
	private Long status;
	private Long parentrole;
	private Date addtime;
	private Long addby;
	private Date modifytime;
	private Long modifyby;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getParentrole() {
		return parentrole;
	}
	public void setParentrole(Long parentrole) {
		this.parentrole = parentrole;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Long getAddby() {
		return addby;
	}
	public void setAddby(Long addby) {
		this.addby = addby;
	}
	public Date getModifytime() {
		return modifytime;
	}
	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}
	public Long getModifyby() {
		return modifyby;
	}
	public void setModifyby(Long modifyby) {
		this.modifyby = modifyby;
	}
}
