package com.springtutorial.pl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		context.registerShutdownHook();
		context.getBean("someBean", SomeBean.class);
		context.close();

	}

}
