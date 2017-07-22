package com.springtutorial.pl.implementation;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.springtutorial.pl.api.Logger;

@Service
public class DateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
