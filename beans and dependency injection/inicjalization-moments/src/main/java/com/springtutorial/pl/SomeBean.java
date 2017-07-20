package com.springtutorial.pl;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
	}

}
