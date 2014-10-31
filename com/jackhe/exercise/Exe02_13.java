package com.jackhe.exercise;

/**
*Exercise 13: (1) Write a method that displays char values in binary form. Demonstrate it using several different characters.

*@Date:2014/10/31
*@Author:JackHe

*/

public class Exe02_13{
	public static void main(String args[]){

		char c1='a';
		char c2='b';
		char c3='c';

		System.out.println("a:"+Integer.toBinaryString(c1));
		System.out.println("b:"+Integer.toBinaryString(c2));
		System.out.println("c:"+Integer.toBinaryString(c3));
	}

}
