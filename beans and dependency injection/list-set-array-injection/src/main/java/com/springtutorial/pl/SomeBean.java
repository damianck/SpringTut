package com.springtutorial.pl;

import java.util.List;
import java.util.Set;

public class SomeBean {
	List<String> stringList;
	Set<Integer> integerSet;
	long[] longArray;

	public SomeBean(List<String> stringList, Set<Integer> integerSet, long[] longArray) {
		this.stringList = stringList;
		this.integerSet = integerSet;
		this.longArray = longArray;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public Set<Integer> getIntegerSet() {
		return integerSet;
	}

	public void setIntegerSet(Set<Integer> integerSet) {
		this.integerSet = integerSet;
	}

	public long[] getLongArray() {
		return longArray;
	}

	public void setLongArray(long[] longArray) {
		this.longArray = longArray;
	}

}
