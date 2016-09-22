package com.hundsun.model;

public class User {
	private Long id;
	private String name;
	private String password;
	private String address;
	private Integer age;

	public User() {
	}
	
	

	public User(String name, String password, String address, Integer age) {
		this.name = name;
		this.password = password;
		this.address = address;
		this.age = age;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
