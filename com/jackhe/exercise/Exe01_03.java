package com.jackhe.exercise;
/**
Exercise 3: (1) Find the code fragments involving ATypeName and turn them into a program that compiles and runs.

@Date:2014/10/23
@Author:JackHe

*/

class ATypeName{
	public void saySomething(){
		System.out.println("I am a new type");
	}
}

public class Exe01_03{
	public static void main(String args[]){
		ATypeName type=new ATypeName();
		type.saySomething();
	}
}
