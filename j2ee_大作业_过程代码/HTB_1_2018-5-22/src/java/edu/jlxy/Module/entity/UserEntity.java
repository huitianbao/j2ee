package edu.jlxy.Module.entity;

public class UserEntity {
	private String userId;
	private String password;
	private String realname;
	private int age;
	private String occupation;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setUserInfo(String userId, String password, String realName, int age, String occupation) {
		setUserId(userId);
		setPassword(password);
		setRealname(realName);
		setAge(age);
		setOccupation(occupation);
	}

}
