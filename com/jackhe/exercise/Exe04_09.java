package com.jackhe.exercise;

/**
*Exercise 9: (1) Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

*@Date:2014/11/02
*@Author:JackHe

*/
class Doll{
	public Doll(int i){
		System.out.println("I am "+i+" years old");
	}

	public Doll(int i,String name){
		this(i);
		System.out.println("My name is "+name);
	}
}

public class Exe04_09{
	public static void main(String args[]){
		Doll doll=new Doll(24,"Jack");
	}
}
