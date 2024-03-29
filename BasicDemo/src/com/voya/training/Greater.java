package com.voya.training;

public class Greater {

	public static void main(String[] args) {
		int x = 40;
		int y = 20;
		int z = 30;
		if (x > y && x > z) {
			System.out.println("X is greater");
		} else if (y > z) {
			System.out.println("Y is greater");
		} else {
			System.out.println("Z is greater");
		}
	}

}
