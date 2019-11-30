package com.revature.eval.java.core.stefanitest;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		System.out.println(calculateNthPrime(2));
	}

	public static int calculateNthPrime(int i) {
		List<Integer> l = new ArrayList<>(); // import arraylist
		for (int x = 2; l.size() < i; x++) { // list .size .length for Arrays
			int count = 0;

			for (int y = 2; y < x; y++) {
				if (x % y == 0) {
					count++;
				}
			}

			if (count == 0) {
				l.add(x);
			}

		}
		return l.get(i - 1);
	}
}