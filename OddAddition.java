package com.example.corejava;

public class OddAddition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Sum of first "+n+"odd numbers:"+oddSum(n));

	}
	public static int oddSum(int n) {
		int sum=0,curr=1;
		for(int i=0;i<n;i++) {
			sum+=curr;
			curr+=2;
		}
		return sum;
	}


}
