package com.jackhe.exercise;

/**
*
Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: the first time without using this, and the second time using this—just to see it working; you should not use this form in practice.

*@Date:2014/11/01
*@Author:JackHe
*/

public class Exe04_08{
	private void funFirst(){
		System.out.println("I am the first function");
	}

	private void funSecond(){
		this.funFirst();
		funFirst();
	}
	public static void main(String args[]){
		Exe04_08 exe=new Exe04_08();
		exe.funSecond();
	}
}
