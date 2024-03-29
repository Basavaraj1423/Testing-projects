package com.voya.training;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] usernames = { "Ajay", "Bhoomika", "Suman", "Surya", "Arul" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your name to login");
		String uname = scanner.next();
		boolean presentname = false;
		for (String username : usernames) {
			if (username.equals(uname)) {
				System.out.println("Login Successfull");
				presentname = true;
				break;
			}
		}
		if (!presentname) {
			System.out.println("Ivalid user");
		}
	}

}
