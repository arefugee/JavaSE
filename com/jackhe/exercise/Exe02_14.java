package com.jackhe.exercise;

/**
*Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your method with some different String objects.

*@Date:2014/10/31
*@Author:JackHe
*/

public class Exe02_14{
	private static void compareStrings(String str1,String str2){
		System.out.println("str1==str2->"+(str1==str2));
		System.out.println("str1!=str2->"+(str1!=str2));
		System.out.println("str1.equals(str2)->"+str1.equals(str2));
	}
	public static void main(String args[]){
		System.out.println("Hello VS World:");
		compareStrings("Hello","world");
		System.out.println("-----------------------");
		System.out.println("Hello VS Hello:");
		compareStrings("Hello","Hello");

		String str1="Hello";
		String str2="Hello";
		System.out.println("str1==str2->"+(str1==str2));
	}
}
