package com.springtutorial.pl.implementation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springtutorial.pl.api.Logger;

@Service
@Qualifier("firstLogger")
public class WithDateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
}
