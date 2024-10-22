package com.ui.pojos;

public class UserCredentials {
	
	
	private String email;
	private String password;
	
	public UserCredentials(String emailAddress,String userpassword) {
		
		super();
		this.email=emailAddress;
		this.password=userpassword;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
