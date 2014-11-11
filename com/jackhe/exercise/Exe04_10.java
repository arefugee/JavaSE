package com.jackhe.exercise;

/**
*Exercise 10: (2) Create a class with a finalize( ) method that prints a message. In main( ), create an object of your class. Explain the behavior of your program.
*@Date:2014/11/02
*@Author:JackHe

*/

class BankAccount{
	private boolean ifLocked=false;

	public void lockAccount(){
		ifLocked=true;	
	}
	public void unlockAccount(){
		ifLocked=false;
	}
	protected void finalize(){
		if(!ifLocked){
			System.out.println("Error:the account is still locked!");
		}
		System.out.println("finalizing...");
	}
	
}

public class Exe04_10{
	public static void main(String args[]){
		BankAccount ba=new BankAccount();
	}
}
