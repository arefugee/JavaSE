package com.jackhe.exercise;

/**
*Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number (from the third on) is the sum of the previous two. Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.

*@Date:2014/11/01
*@Author:JackHe

*/

public class Exe03_09{
	private static void Fibonacci(int num){
		int start=1;
		int second=1;
		System.out.print(start+"  "+second+"  ");
		for(int i=0;i<num-2;i++){
		
			int third=start+second;
			System.out.print(third+"  ");
			start=second;
			second=third;
		} 
	}
	public static void main(String args[]){

		Fibonacci(10);
	}
}
