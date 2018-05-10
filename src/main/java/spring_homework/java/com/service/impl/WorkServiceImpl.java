package spring_homework.java.com.service.impl;

import spring_homework.java.com.service.WorkService;

public class WorkServiceImpl implements WorkService{
	private String title;
	private String price;

	public void insert() {
		System.out.println("insert");
		System.out.println(title);
		System.out.println(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
}
