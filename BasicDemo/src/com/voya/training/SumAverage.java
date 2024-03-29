package com.voya.training;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of an Array");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("The sum of an array is : " + sum);
		System.out.println("The average of an array is : " + sum / arr.length);

	}

}
