package com.hanu.assignmnts;

public class Basehierarchial {
	// Main class to test the hierarchy
		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        Cat cat = new Cat();

		        System.out.println("Dog:");
		        dog.eat();   // inherited from Animal
		        dog.bark();  // specific to Dog

		        System.out.println("\nCat:");
		        cat.eat();   // inherited from Animal
		        cat.meow();  // specific to Cat
		    }
		}
	

	// Base class
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Derived class 1
	class Dog extends Animal {
	    void bark() {
	        System.out.println("Dog barks.");
	    }
	}

	// Derived class 2
	class Cat extends Animal {
	    void meow() {
	        System.out.println("Cat meows.");
	    }
	}
	

		