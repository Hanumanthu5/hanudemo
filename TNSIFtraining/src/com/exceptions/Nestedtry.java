package com.exceptions;

public class Nestedtry {

public static void main(String[] args) {
	
try {
		try{
		
			String s = null;
		    System.out.println(s.length());
	     	}
		    catch(NullPointerException e){
			
			     System.out.println("the null values can't be read");
		        }
		         finally {
			       System.out.println("the null values can't be read and executed succesfully");
	             	}
		 }
		catch(Exception e) {
			System.out.println("outer catch block");
		}
			
		}
}
