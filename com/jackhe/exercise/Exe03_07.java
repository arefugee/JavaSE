package com.jackhe.exercise;

/**
*Exercise 1: (1) Write a program that prints values from 1 to 100.

*@Date:2014/10/31
*@Author:JackHe

*/

public class Exe03_07{
	public static void main(String args[]){
		int j=0;
		for (int i=1;i<=100;i++){
			
			if(i==99) break;
			//if(i==99) return;
			if(i%10==1){
					System.out.println("\n");
				}	
			System.out.print(i+"  ");
			}
			
			
		}
	}
