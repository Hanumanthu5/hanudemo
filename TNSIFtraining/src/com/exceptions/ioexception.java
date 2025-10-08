package com.exceptions;

import java.io.*;

public class ioexception {
	public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        } catch (Exception e) {
            System.out.println("IOException caught: " + e);
        }
    }
}
