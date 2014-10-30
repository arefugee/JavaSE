package com.jackhe.exercise;

/**
*Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they say.

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
public class Exe02_05{

	public static void main(String args[]){
		Dog dog1=new Dog("spot","Ruff");
		Dog dog2=new Dog("scruffy","Wurf");
		
		dog1.introduceItself();
		dog2.introduceItself();
	}
}
