package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtutorial.pl.implementation.SomeBean;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
	SomeBean bean = context.getBean("someBean", SomeBean.class);
	
	}

}
