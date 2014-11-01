package com.jackhe.exercise;

/**
*Exercise 1: (1) Create a class containing an uninitialized String reference. Demonstrate that this reference is initialized by Java to null.

*@Date:2014/11/01
*@Author:JackHe

*/

public class Exe04_01{
	private String strUninied;
	public void printString(){
		System.out.println(strUninied);
	}
	public static void main(String args[]){
		Exe04_01 exe=new Exe04_01();
		exe.printString();
		
	}	

}
