package com.exceptions;

public class Arithmeticexception {
	 public static void main(String[] args) {
	        try {
	            int a = 10 / 0;
	        } catch (Exception e) {
	            System.out.println("ArithmeticException caught: " + e);
	        }
	    }
}
