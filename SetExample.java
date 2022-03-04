package com.example.corejava;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>hash_set=new HashSet<String>();
		hash_set.add("java");
		hash_set.add("C");
		hash_set.add("C++");
		hash_set.add("java script");
		hash_set.add("CSS");
		System.out.println("Hash set");
		System.out.println(hash_set);
		Set<String>linked_hash=new LinkedHashSet<String>();
		linked_hash.add("java");
		linked_hash.add("C");
		linked_hash.add("C++");
		linked_hash.add("java script");
		linked_hash.add("CSS");
		System.out.println("Linked hash set");
		System.out.println(linked_hash);
		Set<String>tree_set=new TreeSet<String>();
		tree_set.add("C");
		tree_set.add("C++");
		tree_set.add("java script");
		tree_set.add("CSS");
		System.out.println("Tree set");
		System.out.println(tree_set);
		
	}

}
