package com.threads;

public class Runnademo {
	public static void main(String[] args) {
		Runnableinterf re =new Runnableinterf();
		Thread te = new Thread(re);
		te.start();
	}
}
