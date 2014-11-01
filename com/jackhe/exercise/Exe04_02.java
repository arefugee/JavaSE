package com.jackhe.exercise;

/**
*Exercise 2: (2) Create a class with a String field that is initialized at the point of definition, and another one that is initialized by the constructor. What is the difference between the two approaches?

*@Date:2014/11/01
*@Author:JackHe

*/

public class Exe04_02{
	
	public String str1="I am initialed at definition";
	public String str2;
	public Exe04_02(String str2){
		this.str2=str2;
	}
	public static void main(String args[]){
		Exe04_02 exe=new Exe04_02("I will be initialed at initialization");
		System.out.println(exe.str1);
		System.out.println(exe.str2);
	}
}
