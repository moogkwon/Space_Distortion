package com.space_distortion.model.vo;

// Member�� NonMember�� �θ� Ŭ����(super)
public class User {
	
	private int userCode;
	
public User() {
	
}


public User(int userCode) {
	super();
	this.userCode = userCode;
}


public int getUserCode() {
	return userCode;
}

public void setUserCode(int userCode) {
	this.userCode = userCode;
}

}