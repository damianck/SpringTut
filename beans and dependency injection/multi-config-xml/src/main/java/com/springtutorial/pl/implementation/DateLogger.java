package com.springtutorial.pl.implementation;

import java.util.Date;

import com.springtutorial.pl.api.Logger;

public class DateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
