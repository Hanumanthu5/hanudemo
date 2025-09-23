package com.exceptions;
class Sample{
	public void show() throws Exception{
		String s = null;
		throw new NullPointerException("not null values");
		
	}
	
}
public class Throwsdemo {
	
	public static void main(String[] args) throws Exception {
		
		Sample s1 = new Sample();
		s1.show();
		
	}
}
