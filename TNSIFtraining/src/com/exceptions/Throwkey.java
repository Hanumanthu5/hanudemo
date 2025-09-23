package com.exceptions;

public class Throwkey {
	public static void main(String[] args) {
		
		int age = 4;
		if(age<18)
		{
			throw new ArithmeticException(" not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

}
