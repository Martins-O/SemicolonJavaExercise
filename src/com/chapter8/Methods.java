package com.chapter8;

import java.util.Arrays;

public class Methods  extends Thread implements Runnable {

	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("$$ Printing Documents #"+i+" from printer");
		}
	}

	public static void main(String[] args) {
		Methods methods = new Methods();

		methods.start();
		System.out.println(methods.getState());
		System.out.println(methods);
		System.out.println(methods.getName());
		System.out.println(Arrays.toString(methods.getStackTrace()));
		methods.interrupt();
		System.out.println(methods.getPriority());
		System.out.println(methods.isAlive());
		System.out.println(methods.hashCode());
		System.out.println(methods.getContextClassLoader());
		System.out.println(getAllStackTraces());
		methods.getUncaughtExceptionHandler().notifyAll();
		System.out.println(methods.isDaemon());

	}
}
