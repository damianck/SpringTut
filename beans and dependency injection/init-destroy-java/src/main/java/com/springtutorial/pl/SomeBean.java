package com.springtutorial.pl;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean, DisposableBean {

	private Logger logger = Logger.getLogger(SomeBean.class.getName());

	@Override
	public void destroy() throws Exception {
		logger.info("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("afterPropestiesSet");
	}

	// 2 way

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}

	// 3 way

	public void initMethod() {
		logger.info("initMethod");
	}

	public void destroyMethod() {
		logger.info("destroyMethod");
	}
}
