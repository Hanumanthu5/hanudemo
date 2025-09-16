package com.hanu.assignmnts;

public class Assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers from 1 to 100 are:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

	}

}
//---------------------------------------------------------------------
