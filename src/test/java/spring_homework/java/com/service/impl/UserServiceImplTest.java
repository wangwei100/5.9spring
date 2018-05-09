package spring_homework.java.com.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_homework.java.com.service.UserService;

public class UserServiceImplTest {

	@Test
	public void test() {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = context.getBean("userServiceImpl", UserService.class);
		service.insert();

		System.out.println("done");
	}

}
