package com.chapter8;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class IntegerSet {

	private boolean[] values;

	public IntegerSet() {
		values = new boolean[10];
	}

	public boolean setOfValues(@NotNull boolean[] values) {
		for(int i = 0; i < values.length; i++) {
			Random random = new Random();
			random.nextInt(10, 100);
			for(int j = 0; j < values.length; j++) {
				if(values[i] == values[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
