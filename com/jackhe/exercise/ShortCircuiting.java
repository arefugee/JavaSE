package com.jackhe.exercise;

/**
	A very good example to demonstrate short-circuiting
*@Date: 2014/10/30
*@Author:JackHe

*/

public class ShortCircuiting{

	private static boolean test1(int val1){
		System.out.println("test1("+val1+")");
		System.out.println("result:"+(val1<1));
		return val1<1;
	}

	private static boolean test2(int val2){
		System.out.println("test2("+val2+")");
		System.out.println("result:"+(val2<2));
		return val2<2;
	}

	private static boolean test3(int val3){
		System.out.println("test3("+val3+")");
		System.out.println("result:"+(val3<3));
		return val3<3;
	}

	public static void main(String args[]){
		boolean b=test1(0)&&test2(2)&&test3(3);

		System.out.println("The expression is:"+b);
	}

}
