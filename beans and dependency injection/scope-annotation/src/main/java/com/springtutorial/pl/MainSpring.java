package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		CounterUsers bean = context.getBean("counterUsers", CounterUsers.class);
		
		
		System.out.println("getPrototypeCounter1()");
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println(bean.getPrototypeCounter1().getCounter());
		System.out.println("getPrototypeCounter2()");
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println(bean.getPrototypeCounter2().getCounter());
		System.out.println("getSingletonCounter1()");
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println(bean.getSingletonCounter1().getCounter());
		System.out.println("getSingletonCounter2()");
		System.out.println(bean.getSingletonCounter2().getCounter());
		System.out.println(bean.getSingletonCounter2().getCounter());
	}

}
