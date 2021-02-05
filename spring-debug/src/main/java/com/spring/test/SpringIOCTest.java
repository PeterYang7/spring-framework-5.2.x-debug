package com.spring.test;


import com.spring.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author peter
 * @Date 2021/1/22-16:30
 */
public class SpringIOCTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${username}.xml");
		User user = (User)applicationContext.getBean("user");
		System.out.println(user);

//		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("ioc.xml");

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");
//		User user1 = (User) context.getBean("user");
//		System.out.println(user1);

//		User user = (User) applicationContext.getBean("peter");
//		System.out.println(user.getUsername());
	}
}
