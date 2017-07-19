package com.springtutorial.pl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

//		Locale locale = Locale.getDefault();
//		Calendar calendar = GregorianCalendar.getInstance(locale);
//
//		DateFormat instance = SimpleDateFormat.getInstance();
//		
//		System.out.println(instance.format(calendar.getTime()));
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Calendar bean = context.getBean("calendar", Calendar.class);
		
		DateFormat bean2 = context.getBean("format", DateFormat.class);
		
		System.out.println(bean2.format(bean.getTime()));
		
	}

}
