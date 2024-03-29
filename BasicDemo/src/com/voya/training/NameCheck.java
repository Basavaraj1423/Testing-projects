package com.voya.training;

import java.util.Scanner;

public class NameCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.next();
		if (name.equals("Basavaraj")) {
			System.out.println("Welcome " + name.toUpperCase());
		} else {
			System.out.println("Wrong user");
		}

	}

}
