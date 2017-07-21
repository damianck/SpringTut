package com.springtutorial.pl.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springtutorial.pl.api.Logger;

@Service
@Qualifier("secondLogger")
public class CounterLogger implements Logger {
	private int counter = 0;

	@Override
	public void log(String message) {
		System.out.println(counter++ + ": " + message);
	}

}
