package com.jackhe.exercise;

/**
*Exercise 6: (2) Modify the two test( ) methods in the previous two programs so that they take two extra arguments, begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.

*@Date:2014/11/01
*@Author:JackHe

*/

public class Exe03_06{
	private static boolean test(int testVal, int begin,int end){
		
		if(testVal>=begin&&testVal<=end){
			return true;	
		}
			return false;
	}
	public static void main(String args[]){
		boolean flag;
		flag=test(12,3,56);
		System.out.println(flag);
	}
}
