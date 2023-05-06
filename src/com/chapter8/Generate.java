package com.chapter8;

import java.security.SecureRandom;

public class Generate {

	public static int generator(){
		SecureRandom random = new SecureRandom();
		return random.nextInt(10,100);
	}

	public static void main(String[] args) {
		System.out.println(generator());
	}
}
