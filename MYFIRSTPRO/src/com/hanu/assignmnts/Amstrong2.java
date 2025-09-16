package com.hanu.assignmnts;

import java.util.Scanner;

public class Amstrong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int Originalnum = num;
        int digits=String.valueOf(num).length();
        int sum=0;
        while(num>0) {
        	int digit =num % 10;
        	sum += Math.pow(digit, digits);
        	num/=10;
        }
        if (sum == Originalnum) {
            System.out.println(Originalnum + " is an Armstrong number.");
        } else {
            System.out.println(Originalnum + " is not an Armstrong number.");
        }

        scanner.close();


	}

}
