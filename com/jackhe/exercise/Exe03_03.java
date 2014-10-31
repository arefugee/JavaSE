package com.jackhe.exercise;

/**
*Exercise 3: (1) Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run until you interrupt it from the keyboard (typically by pressing Control-C).

*@Date:2014/10/31
*@Author:JackHe

*/
import java.util.*;
public class Exe03_03{

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
		/*
		for(int i=0;i<25;i++){
			compareRandomValues(ran);
		}*/
		while(true){
			compareRandomValues(ran);
		}
	}
}
