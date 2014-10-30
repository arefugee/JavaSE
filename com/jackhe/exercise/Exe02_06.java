package com.jackhe.exercise;

/**
*Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object. Test for comparison using == and equals( ) for all references.
*@Date:2014/10/30
*@Author:JackHe
*/
class Dog{
	private String name;
	private String says;

	public Dog(String name, String says){
		
		this.name=name;
		this.says=says;
	}
	public void introduceItself(){
		System.out.println("Hi, I am "+name+", I can "+says);
	}
}
public class Exe02_06{

	public static void main(String args[]){
		Dog dog1=new Dog("spot","Ruff");
		Dog dog2=new Dog("scruffy","Wurf");
		/*
		dog1.introduceItself();
		dog2.introduceItself();
		*/

		dog1=dog2;
		
		dog1.introduceItself();
		dog2.introduceItself();
		System.out.println(dog1==dog2);
		System.out.println(dog1.equals(dog2));
	}
}
