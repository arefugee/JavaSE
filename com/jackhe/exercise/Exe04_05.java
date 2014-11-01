package com.jackhe.exercise;

/**
*Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on various primitive data types, and print different types of barking, howling, etc., depending on which overloaded version is called. Write a main( ) that calls all the different versions.

*@Date:2014/11/01
*@Author:JackHe

*/

class Dog{
	public void bark(int i){
		System.out.println("I am "+i+" years old");
	}
	public void bark(String name){
		System.out.println("My name is "+name);
	}
	public void bark(float weight){
		System.out.println("I weigh "+weight+"kilogram");
	}	
}

public class Exe04_05{
	public static void main(String args[]){
		Dog dog=new Dog();
		dog.bark(5);
		dog.bark(5.5f);
		dog.bark("Jack");
	//	dog.bark();
	}
}
