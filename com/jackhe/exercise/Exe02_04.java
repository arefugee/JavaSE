package com.jackhe.exercise;

/**
*Exercise 4: (2) Write a program that calculates velocity using a constant dista*nce and a constant time.
*@Date:2014/10/30
*@Author:JackHe

*/
import java.util.*;
public class Exe02_04{

	public static void main(String args[]){
		float time,velocity,length;
		Random ran=new Random(10);
		
		for(int i=0;i<10;i++){
		length=ran.nextFloat();
		time=ran.nextFloat();

		velocity=length/time;

		System.out.println("Velocity is:"+velocity);
		}
	}
}
