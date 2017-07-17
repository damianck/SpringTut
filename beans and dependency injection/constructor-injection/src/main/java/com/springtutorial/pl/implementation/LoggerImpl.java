package com.springtutorial.pl.implementation;

import java.util.Date;

import com.springtutorial.pl.api.Logger;

public class LoggerImpl implements Logger {
	private String name;
	private int version;

	public void log(String message) {
		System.out.println(new Date() + ": [ " + name + " v." + version + " ] " + message);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setVersion(int version) {
		this.version = version;
	}

}
