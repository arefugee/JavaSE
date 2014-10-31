package com.jackhe.exercise;

/**
*Exercise 4: (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).

*@Date:2014/10/31
*@Author:JackHe
*/

public class Exe03_04{
	public static void main(String args[]){
		int DEFAULT=100;
		int num=DEFAULT;
	//	int flag=0;
/*
		if(args.length!=0){
			num=Integer.parseInt(args[0]);
		}
*/
	for(int i=1;i<=num;i++){
//		System.out.println(i);
		
		boolean prime=true;   //to label a prime
		
		for(int j=2;j<i;j++)
			if(i%j==0)
			prime=false;
			if(prime)
			System.out.print(i+"  ");
			}
		System.out.println("\n");
		}

}
