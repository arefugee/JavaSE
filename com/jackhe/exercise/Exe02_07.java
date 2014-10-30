package com.jackhe.exercise;

/**
*Exercise 7: (3) Write a program that simulates coin-flipping.

*@Date:2014/10/30
*@Author:JackHe

*/
import java.util.*;
public class Exe02_07{

	public static void main(String args[]){
		
		Random ran=new Random(100);
		for(int i=0;i<15;i++){
		boolean flag=ran.nextBoolean();
		
		if(flag==true){
			System.out.println("head");
		}else{
			System.out.println("tail");
		}
			}
	}
}
