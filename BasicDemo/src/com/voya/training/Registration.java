package com.voya.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames = { "Ajay", "Naveen", "Suman", "Surya", "Arul" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your name to Register");
		String uname = scanner.next();
		boolean presentname = false;
		for (String username : usernames) {
			if (username.equals(uname)) {
				System.out.println("The username already exists");
				presentname = true;
				break;
			}
		}
		if (!presentname) {
			System.out.println("Registered successfully");
		}
	}

}
