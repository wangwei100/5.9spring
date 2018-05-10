package com.demohot.com.homework.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demohot.homework.dao.WorkDao;

import spring_homework.java.com.po.Work;

public class WorkDaoImplTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		WorkDao workDao = context.getBean("workDaoImpl", WorkDao.class);
		Work work = new Work();
		work.setId("xxx");
		work.setPrice("111");
		work.setTitle("xxx@111");
		workDao.insert(work);
	}
}
