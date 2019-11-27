package com.revature.eval.java.core.stefanitest;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toPigLatin("quick brown fox");
	}

	public static String toPigLatin(String string) {
		String[] arr = string.split(" ");
		System.out.println(arr[0]);
		char first;

		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);

			while (sb.charAt(0) != ('o') && sb.charAt(0) != ('i') && sb.charAt(0) != ('e') && sb.charAt(0) != ('a')
					&& sb.charAt(0) != ('u')) {
				if (sb.charAt(0) == 'q') {
					sb.append('q');
					sb.append('u');
					sb.deleteCharAt(0);
					sb.deleteCharAt(0);

				} else {
					first = sb.charAt(0); // first = p <-- pig
					sb.deleteCharAt(0); // deleting p --> ig
					sb.append(first); // first == p --> igp
					
				}
				
				
				if(sb.charAt(0) == ('o') && sb.charAt(0) == ('i') && sb.charAt(0 ) == ('e') && sb.charAt(0) == ('a')
						&& sb.charAt(0) == ('u')) {
					if(sb.charAt(pig))
				}
				sb.append('a');
				sb.append('y');

			}
		}
		/*
		 * StringBuilder =sbpig = new StringBuilder(); sbpig.append(arr[0]); for(int
		 * i=1; i < arr.length; i++) { sbpig.append(" "); sbpig.append(arr[i]); } String
		 * pig = new String(sbpig);
		 */
		return null;

		// TODO Write an implementation for this method declaration
	}
}
