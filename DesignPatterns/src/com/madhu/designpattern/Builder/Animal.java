package com.madhu.designpattern.Builder;

public class Animal {

	private String name;
	private String category;

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public Animal(AnimalBuilder builder) {
		this.name = builder.name;
		this.category = builder.category;
	}

	public static class AnimalBuilder {
		private String name;
		private String category;

		public AnimalBuilder(String name, String category) {
			this.name = name;
			this.category = category;
		}

		public Animal build() {
			return new Animal(this);
		}
	}

}
