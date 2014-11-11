package com.jackhe.exercise;

/**
*Exercise 11: (4) Modify the previous exercise so that your finalize( ) will always be called.
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

public class Exe04_11{
	public static void main(String args[]){
//		BankAccount ba=new BankAccount();

		new BankAccount();
		System.gc();
		System.runFinalization();
		System.out.println("....");
	}
}
