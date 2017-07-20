package com.springtutorial.pl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// `implements DisposableBean` is not recommended
public class SomeBean implements DisposableBean {
	public void destroyMethod() {
		System.out.println("destroy destroy bean");
	}

	public void checkIsWorking() {
		System.out.println("work!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean is working");
	}

}
