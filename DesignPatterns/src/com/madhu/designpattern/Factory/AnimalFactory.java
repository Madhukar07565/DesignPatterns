package com.madhu.designpattern.Factory;

public class AnimalFactory {

	public static Animal getAnimal(String type) {
		if (type.equals("Cat")) {
			return new Cat("cat");
		} else if (type.equals("Dog")) {
			return new Dog("Dog");
		} else {
			return null;
		}
	}

}
