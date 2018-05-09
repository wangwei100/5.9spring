package spring_homework.java.com.service.impl;

import spring_homework.java.com.service.UserService;

public class UserServiceImpl implements UserService {
	
	private String name;
	private String password;

	public void insert() {
		System.out.println("insert");
		System.out.println(name);
		System.out.println(password);
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
	
}
