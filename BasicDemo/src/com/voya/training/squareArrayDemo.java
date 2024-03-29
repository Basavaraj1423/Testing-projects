package com.voya.training;

import java.util.Scanner;

public class squareArrayDemo {

	public static void main(String[] args) {
		int[] nums = new int[5];
		int[] squares = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values to an array:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			squares[i] = nums[i] * nums[i];
		}
		System.out.println("The squares of those numbers is:");
		for (int x : squares) {
			System.out.print(x+" ");
		}
		System.out.println();

	}

}
