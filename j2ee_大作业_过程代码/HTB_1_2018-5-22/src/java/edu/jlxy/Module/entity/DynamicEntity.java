package edu.jlxy.Module.entity;

public class DynamicEntity {
	private String userId;
	private String title;
	private String content;
	private String photoURL;
	private String date;
	private String permission;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public void setAllInfo(String userId, String title, String content,String permisson, String photoURL, String date
			) {

		setUserId(userId);
		setTitle(title);
		setContent(content);
		setPhotoURL(photoURL);
		setDate(date);
		setPermission(permisson);
	}

}
