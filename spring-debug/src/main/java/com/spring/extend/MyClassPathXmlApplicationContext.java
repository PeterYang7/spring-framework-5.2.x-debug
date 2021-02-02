package com.spring.extend;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author peter
 * @Date 2021/1/28-20:49
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String...configLocations){
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources()方法");
		getEnvironment().setRequiredProperties("username");
		getEnvironment().validateRequiredProperties();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
