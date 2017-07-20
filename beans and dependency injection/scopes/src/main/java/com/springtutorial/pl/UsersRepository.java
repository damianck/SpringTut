package com.springtutorial.pl;

public class UsersRepository {
	private static int instance = 0;
	private int instanceNumber = instance++;

	public int getInstanceNumber() {
		return instanceNumber;
	}

	public void setInstanceNumber(int instanceNumber) {
		this.instanceNumber = instanceNumber;
	}

}
