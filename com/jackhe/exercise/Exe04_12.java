package com.jackhe.exercise;

/**
*Exercise 12: (4) Create a class called Tank that can be filled and emptied, and has a termination condition that it must be empty when the object is cleaned up. Write a finalize( ) that verifies this termination condition. In main( ), test the possible scenarios that can occur when your Tank is used.

*@Date:2014/11/02
*@Author:JackHe

*/

class Tank{
	private int num;
	private boolean isEmpty;
	
	public Tank(int num){
	fillTank();
	this.num=num;
	}
	public void fillTank(){
		isEmpty=false;
	}
	public void emptiyTank(){
		isEmpty=true;
	}
	protected void finalize(){
		if(!isEmpty){
		System.out.println("Tank"+this.num+"->Error： The tank should be emptied!");
		}
	}
}

public class Exe04_12{
	public static void main(String args[]){
		for(int i=0;i<100;i++){
		new Tank(i);
		}
		System.gc();
		System.runFinalization();
	}
}
