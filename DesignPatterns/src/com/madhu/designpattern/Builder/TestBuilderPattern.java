package com.madhu.designpattern.Builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		
		Animal a = new Animal.AnimalBuilder("Cat", "Two Legs").build();
		
		System.out.println(a.getName());
		
		System.out.println(a.getCategory());
	}
	
}
