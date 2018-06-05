package com.hp.model;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;

	private Integer user_id;

    private String user_name;

    private String password;

    private String phone;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name
				+ ", password=" + password + ", phone=" + phone + "]";
	}

	public User(Integer user_id, String user_name, String password,
			String phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.phone = phone;
	}

	public User() {
		super();
	}
    
	
    
}