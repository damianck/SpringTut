package com.springtutorial.pl;

import org.springframework.beans.factory.InitializingBean;

// `implements InitializingBean` is not recommended
public class SomeBean implements InitializingBean {
	public void init() {
		System.out.println("init bean");
	}

	public void checkIsWorking() {
		System.out.println("work!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean is here");
	}
}
