package com.exceptions;

public class UncheckedExceptions {
	public static void main(String[] args) {
		
		try{
		
			String s = null;
		    System.out.println(s.length());
		}
		catch(NullPointerException e){
			
			System.out.println("the null values can't br read");
		}
		
		try {
			int a = 4, b= 0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("division by zero cannot be done");
		}
    }
}
