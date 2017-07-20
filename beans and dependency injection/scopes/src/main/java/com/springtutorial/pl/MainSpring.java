package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Component1 component1 = context.getBean("c1", Component1.class);
		Component2 component2 = context.getBean("c2", Component2.class);

		
		System.out.println(component1.getUsersRepository().getInstanceNumber());
		System.out.println(component2.getUsersRepository().getInstanceNumber());
		System.out.println(component2.getUsersRepository().getInstanceNumber());
	}

}