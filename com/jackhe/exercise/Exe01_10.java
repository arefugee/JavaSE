package com.jackhe.exercise;
/**

Exercise 10: (2) Write a program that prints three arguments taken from the command line. To do this, you’ll need to index into the command-line array of Strings.

@Date:2014/10/27
@Author:JackHe

*/

public class Exe01_10{
	
	public static void main(String args[]){
		
		System.out.println("The three arguments taken from command line are:\n");
		for(int i=0;i<3;i++){
			System.out.println(args[i]);
		}
	}

}
