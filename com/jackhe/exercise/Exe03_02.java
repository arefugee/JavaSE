package com.jackhe.exercise;

/**
*Exercise 2: (2) Write a program that generates 25 random int values. For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.

*@Date:2014/10/31
*@Author:JackHe

*/
import java.util.*;
public class Exe03_02{

	private static void compareRandomValues(Random ran){
	//	Random ran=new Random(100);
		int i1=ran.nextInt();
		int i2=ran.nextInt();

		System.out.println("value1:"+i1+",value2:"+i2);
		if(i1>i2)
		System.out.println("i1>i2");
		if(i1<i2)
		System.out.println("i1<i2");
		if(i1==i2)
		System.out.println("i1==i2");
	}
	public static void main(String args[]){
		Random ran=new Random();
		for(int i=0;i<25;i++){
			compareRandomValues(ran);
		}
	}
}
