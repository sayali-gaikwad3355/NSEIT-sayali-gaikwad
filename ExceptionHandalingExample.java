package com.example.corejava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandalingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 0, c;
		//int arr[]={​​​1, 2, 3 }​​​;
        try {
        	System.out.println("Inside the try block..");
        	//System.out.println(arr[4]);
        	c = a / b;
        	System.out.println("The c :" + c);
        	System.out.println("After c value...");

        }catch (ArithmeticException e) {
        	System.out.println("inside the Arthimetic catch block");	
        } catch (Exception e) {
        	System.out.println("inside the ArrayIndex catch block");
        }
         finally {
        	 System.out.println("Inside the finally block");

         }
        System.out.println("After the finally block");

	}

}
