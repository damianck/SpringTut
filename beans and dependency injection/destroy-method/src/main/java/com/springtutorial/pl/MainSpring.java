package com.springtutorial.pl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.registerShutdownHook();
		SomeBean bean = context.getBean("someBean", SomeBean.class);

		bean.checkIsWorking();

	}

}
