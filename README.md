## Design Patterns

### Singleton Design Pattern

Singleton pattern restricts the instantiation of a class and ensures that only
one instance of the class exists in the java virtual machine.

Example of creating singleton design pattern is present under the singleton directory.

### Factory Design Pattern

Factory design pattern is used when we have a super class with multiple subclasses
and based on input, we need to return one of the sub-class. This
pattern take out the responsibility of instantiation of a class from client
program to the factory class.

### Builder Design Pattern

Builder pattern solves the issue with large number of optional parameters
and inconsistent state by providing a way to build the object step-by-step
and provide a method that will actually return the final Object.

Steps to create: 
1) Create a class and nested class init. Like create Animal class and AnimalBuilder init.
2) Copy all the arguments from Animal to AnimalBuilder
3) Builder should have the public constructor with required attributes.
4) We need to provide the build() method which will return the object of the Animal.




