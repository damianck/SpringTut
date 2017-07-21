package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		System.out.println(bean.getProperty());
		DatabaseRepository bean2 = context.getBean("db", DatabaseRepository.class);
		System.out.println(bean2.toString());
	}

}
