package com.voya.training;

public class Ternary {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		String z = a > b && b > c ? "x is greater" : b > c ? "b is greater" : "c is greater";
		System.out.println(z);
		
		//int val = (a>b&&b>c)?a:(b>c)?c;
	}

}
