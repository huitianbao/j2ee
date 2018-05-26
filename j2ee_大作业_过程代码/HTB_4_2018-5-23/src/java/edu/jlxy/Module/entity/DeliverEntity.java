package edu.jlxy.Module.entity;

import java.sql.Date;

public class DeliverEntity {
	private String uid;
	private String fid;
	private String nid;
	private Date date;//此处Date是java.sql.Date，注意转换！！！
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setAllInfo(String uid,String fid,Date date){
		setUid(uid);
		setFid(fid);
		setDate(date);
	}
	
}
