package com.voya.training;

public class OneDimen {

	public static void main(String[] args) {
		int[] marks = new int[4];
		System.out.println(marks[1]);
		System.out.println(marks.length);
		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 95;
		// marks[4]=74;

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		for (int x : marks) {
			System.out.println(x);
		}

	}

}
