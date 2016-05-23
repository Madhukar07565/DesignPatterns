## Design Patterns

### Creational Design Patterns  
Provide solution to instantiate an object in the best
possible way for specific situations.

### Structuaral Design Patterns 
Provide different ways to create a class structure, for
example using inheritance and composition to create a large object from
small objects

### Behavioral Design Patterns 
Provide solution for the better interaction between
objects and how to provide lose coupling and flexibility to extend easily.

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

### Facade Design Pattern

Provide a unified interface to a set of interfaces in a subsystem. Facade
Pattern defines a higher-level interface that makes the subsystem easier to
use.

 Facade pattern is more like a helper for client applications, it doesn’t
hide subsystem interfaces from the client. 
 Facade pattern can be applied at any point of development, usually
when the number of interfaces grow and system gets complex.
 Subsystem interfaces are not aware of Facade and they shouldn’t have
any reference of the Facade interface.
 Facade pattern should be applied for similar kind of interfaces, its
purpose is to provide a single interface rather than multiple interfaces
that does the similar kind of jobs.

### Adapter Design Pattern

Adapter design pattern is one of the structural design pattern and it’s
used so that two unrelated interfaces can work together. The object that joins
these unrelated interface is called an Adapter. As a real life example, we
can think of a mobile charger as an adapter because mobile battery needs 3
volts to charge but the normal socket produces either 120V or 240V. 
So the mobile charger works as an adapter between mobile charging
socket and the wall socket.

### Template Design Pattern

### Memento design pattern 
is used when we want to save the state of an object so that we
can restore later on

