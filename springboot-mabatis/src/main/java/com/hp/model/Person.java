package com.hp.model;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ck
 * @date 2018年5月30日 下午4:02:23
 */
//@Table(name="person")
public class Person {

	@Id
	private String id;
	private String name;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Person(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
	
	
}
