package com.jackhe.exercise;
/**
*Exercise 1: (2) Create a class containing an int and a char that are not initialized, and print their values to verify that Java performs default initialization.
*
*@Date 2014/10/23
*@Author:JackHe
*/


class Test{
	private int i;
	private char j;

	public void printField(){
		System.out.println("default value of int i is: "+i);
		System.out.println("default value of char j is: "+(int)j);
	}
}

public class Exe01_01{
	public static void main(String args[]){
		Test test=new Test();
		test.printField();
		}

	}
