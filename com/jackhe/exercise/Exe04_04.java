package com.jackhe.exercise;

/**
*Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class.

*@Date:2014/11/01
*@Author:JackHe

*/

class DefaultCon{
	public DefaultCon(){
		System.out.println("I am a message from a default constructor");
	}
	public DefaultCon(String str){
		System.out.println(str);
	}
}

public class Exe04_04{
	public static void main(String args[]){
		DefaultCon dc=new DefaultCon();	
		DefaultCon dc2=new DefaultCon("I am message as a argument of constructor");
		}
	}
