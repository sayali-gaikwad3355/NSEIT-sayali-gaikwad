package com.example.corejava;

import java.util.Scanner;

public class TestAgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age..");
		int age = sc.nextInt();
		TestAge t = new TestAge();

		try {
			t.checkAge(age);
		}catch(InSufficentAgeException1 e) {
			System.out.println(e);

		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}

}
