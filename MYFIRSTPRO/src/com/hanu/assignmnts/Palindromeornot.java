package com.hanu.assignmnts;

import java.util.Scanner;

public class Palindromeornot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        int originalnum=num;
        int reversed=0;
        while(num>0) {
        	 int digit=num%10;
        	 reversed=reversed*10+digit;
        	 num/=10;
        	
        }
		if (originalnum == reversed) {
			System.out.print(originalnum + " its a palindrome");
		}
		else {
			System.out.print(originalnum +" its not a palindrome");
		}
	}
}
