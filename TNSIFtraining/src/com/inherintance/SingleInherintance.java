package com.inherintance;

public class SingleInherintance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher tr = new Teacher();
		 Student stu= new Student();
		 tr.display();
		 stu.display1();
		 stu.display();
	}

}

class Teacher{
	public void display() {
		System.out.println("Teacher is teaching");
	}
}

class Student extends Teacher {
	 public void display1() {
		 System.out.println("Student is listening");
	 }
}
	
