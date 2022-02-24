package com.example.corejava;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>languages=new ArrayList<>();
		//add method
		languages.add("java");
		languages.add("python");
		languages.add("c++");

      System.out.println("ArrayList:"+languages);
      //get the elements from the arrlist
      String str=languages.get(1);
      System.out.println("Elements at index 1:"+str);
      //change element of array list
      languages.set(2, "javascript");
      System.out.println("Modified ArryList is:"+languages);
      //remove element from index 2
      String str1=languages.remove(2);
      System.out.println("updated ArrayList:"+languages);
      System.out.println("Remve Elemnt:"+str);
      //iterate using for-each loop
      System.out.println("Accesing individual elements:");
      for(String str2:languages)
      {
    	  System.out.println(str2);
    	  System.out.println(",");
      }
	}

}
