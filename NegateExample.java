package com.example.corejava;
import java.util.function.Predicate;
public class NegateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Predicate<Integer>greaterThanTen=(i)->i>10;
        Predicate<Integer>lowerThanTwenty=(i)->i<20;
        boolean result=greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
        boolean result2=greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
	}

}
