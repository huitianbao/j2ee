package edu.jlxy.Module.entity;

public class FriendEntity {
	private String userId;
	private String friendId;
	private String label1;
	private String label2;
	private String label3;
	private String label4;
	private String label5;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getLabel1() {
		return label1;
	}

	public void setLabel1(String label1) {
		this.label1 = label1;
	}

	public String getLabel2() {
		return label2;
	}

	public void setLabel2(String label2) {
		this.label2 = label2;
	}

	public String getLabel3() {
		return label3;
	}

	public void setLabel3(String label3) {
		this.label3 = label3;
	}

	public String getLabel4() {
		return label4;
	}

	public void setLabel4(String label4) {
		this.label4 = label4;
	}

	public String getLabel5() {
		return label5;
	}

	public void setLabel5(String label5) {
		this.label5 = label5;
	}
	
	public void setFriendInfo(String userId,String friendId,String label1,String label2,String label3,String label4,String label5){
		setFriendId(friendId);
		setUserId(userId);
		setLabel1(label1);
		setLabel2(label2);
		setLabel3(label3);
		setLabel4(label4);
		setLabel5(label5);
	}

}
