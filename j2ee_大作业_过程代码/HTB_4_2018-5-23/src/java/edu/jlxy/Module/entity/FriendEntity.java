package edu.jlxy.Module.entity;

public class FriendEntity {
	private String uid;
	private String fid;
	private String l1=null;
	private String l2=null;
	private String l3=null;
	private String l4=null;
	private String l5=null;

	public String getuid() {
		return uid;
	}

	public void setuid(String uid) {
		this.uid = uid;
	}

	public String getfid() {
		return fid;
	}

	public void setfid(String fid) {
		this.fid = fid;
	}

	public String getl1() {
		return l1;
	}

	public void setl1(String l1) {
		this.l1 = l1;
	}

	public String getl2() {
		return l2;
	}

	public void setl2(String l2) {
		this.l2 = l2;
	}

	public String getl3() {
		return l3;
	}

	public void setl3(String l3) {
		this.l3 = l3;
	}

	public String getl4() {
		return l4;
	}

	public void setl4(String l4) {
		this.l4 = l4;
	}

	public String getl5() {
		return l5;
	}

	public void setl5(String l5) {
		this.l5 = l5;
	}
	
	public void setFriendInfo(String uid,String fid,String l1,String l2,String l3,String l4,String l5){
		setfid(fid);
		setuid(uid);
		setl1(l1);
		setl2(l2);
		setl3(l3);
		setl4(l4);
		setl5(l5);
	}

}
