package com.example.corejava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandalingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100, b = 20;
			System.out.println("Inside the try block...");
			if (a < b)
			throw new ArrayIndexOutOfBoundsException();
			else
			throw new NullPointerException();
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Inside the array index out of bounds exception");
			
		}
		catch (NullPointerException e) {
			
			System.out.println("Inside the nullpointer exception");
		}
		finally {
			
			System.out.println("Inside the finally block...");

		}
	}

}
