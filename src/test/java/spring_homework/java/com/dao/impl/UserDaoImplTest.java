package spring_homework.java.com.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_homework.java.com.dao.UserDao;
import spring_homework.java.com.po.User;

public class UserDaoImplTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = context.getBean("userDaoImpl", UserDao.class);
		User user = new User();
		user.setUsername("xxx");
		user.setPassword("111");
		user.setEmail("xxx@111");
		userDao.insert(user);
	}

}
