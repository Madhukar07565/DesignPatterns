package com.madhu.designpattern.Factory;

public class Dog extends Animal {
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
