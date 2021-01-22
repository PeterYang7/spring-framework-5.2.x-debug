package com.spring.test;

import com.spring.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author peter
 * @Date 2021/1/22-16:30
 */
public class SpringIOCTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
		User user = (User)applicationContext.getBean("user");
		System.out.println(user);
	}
}
