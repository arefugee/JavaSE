package com.jackhe.exercise;
/**
Exercise 8: (3) Write a program that demonstrates that, no matter how many objects you create of a particular class, there is only one instance of a particular static field in that class.

*@Date:2014/10/23
*@Author:JackHe
*/

class Monkey{
	private static int count=0;

	public Monkey(){
		count++;
		System.out.println("This is the Monkey  "+count);
	}
}

public class Exe01_08{
	public static void main(String args[]){
		for(int i=0;i<10;i++){
			Monkey monkey=new Monkey();
		}
	}
}
