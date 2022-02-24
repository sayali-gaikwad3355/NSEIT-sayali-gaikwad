package com.example.corejava;
import java.util.stream.Stream;
public class StartK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arr= {"kitt","for","kettle"};
		String str="kittiforkettle";
		Stream.of();
		 if(Stream.of(arr).anyMatch(str::startsWith))
		 System.out.println("Given String"+"starts with one of the k");
		 else
			 System.out.println("Given String do not"+"starts with one of the prefixes");

	}

}
