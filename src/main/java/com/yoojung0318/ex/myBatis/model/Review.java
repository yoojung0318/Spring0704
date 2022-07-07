package com.yoojung0318.ex.myBatis.model;

import java.util.Date;

public class Review {

	private int id;
	private int storeId;
	private String menu;
	private String userName;
	private double point;
	private String review;
	private Date createdAt;
	private Date updateaAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateaAt() {
		return updateaAt;
	}
	public void setUpdateaAt(Date updateaAt) {
		this.updateaAt = updateaAt;
	}
}
