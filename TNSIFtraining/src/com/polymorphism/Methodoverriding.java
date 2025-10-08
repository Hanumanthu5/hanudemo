package com.polymorphism;
class Methodoverride{
	public void show() {
		System.out.println("This is parent class");
	}
}
class Child extends Methodoverride{
	public void show() {
		System.out.println("This is child class");
	}
}

public class Methodoverriding {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		
	}
}
