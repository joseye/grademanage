package com.gradeadminsystrem.bean;

import java.util.Date;

public class Authority {
	private Long id;
	private String authorityname;
	private String url;
	private Date addtime;
	private Long addby;
	private Date modifytime;
	private Long modifyby;
	private Integer status;
	private Long parentid;
	private Authority parentau;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthorityname() {
		return authorityname;
	}
	public void setAuthorityname(String authorityname) {
		this.authorityname = authorityname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getParentid() {
		return parentid;
	}
	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}
	public Authority getParentau() {
		return parentau;
	}
	public void setParentau(Authority parentau) {
		this.parentau = parentau;
	}
	@Override
	public int hashCode() {
		return id.hashCode()+authorityname.hashCode();
	}
	@Override
	/**
	 * 只为简便判断，，
	 *  // TODO 有空时优化
	 */
	public boolean equals(Object obj) {
		if(null==obj)
			return false;
		if(!(obj instanceof Authority))
			return false;
		Authority tmp=(Authority)obj;
		if(id==tmp.getId()||(null!=id &&id.equals(tmp.getId()))){
			return true;
		}
		return false;
	}
	public Authority() {
		this.status=0;
	}
	
}
