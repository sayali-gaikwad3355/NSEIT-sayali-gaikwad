package com.example.corejava;


import java.util.function.Predicate;

public class PredicateExample{
	static boolean checkAge(int age)
	{
		if(age>17)
			return true;
		else return false;
		
	}

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Predicate<Integer>predicate=PredicateExample::checkAge;
		boolean result=predicate.test(25);
		System.out.println(result);
		}

}
