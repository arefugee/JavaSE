package com.jackhe.exercise;

/**
*Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types), but in reversed order relative to each other. Verify that this works.

*@Date:2014/11/01
*@Author:JackHe
*/

class Dog{
	public void bark(int age,String name){
		System.out.println("I am "+age+" years old"+"and my name is"+name);
	}
	public void bark(String name,int age){
		System.out.println("My name is "+name+" and I am "+age+" years old");
		
	}
}

public class Exe04_06{
	public static void main(String args[]){
		Dog dog=new Dog();
		dog.bark(5,"Jack");
		dog.bark("Jack",5);
	}
}
