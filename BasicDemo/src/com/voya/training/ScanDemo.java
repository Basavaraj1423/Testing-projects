package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		System.out.println("Enter you Designation");
		sc.nextLine();
		String Designation = sc.nextLine();
		System.out.println("Enter you Salary");
		double salary = sc.nextDouble();

		System.out.println("Your name: " + name + "\nYour id: " + id + "\nYour Age: " + age + "\nYour Designation: "
				+ Designation + "\nYour Salary: " + salary);
		sc.close();

	}

}
