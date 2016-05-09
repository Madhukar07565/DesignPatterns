package com.madhu.designpattern.Factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		Cat c = (Cat) AnimalFactory.getAnimal("Cat");
		
		System.out.println(c.getName());
		
		Dog d = (Dog) AnimalFactory.getAnimal("Dog");
		
		System.out.println(d.getName());
	}

}
