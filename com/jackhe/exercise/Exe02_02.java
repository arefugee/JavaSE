package com.jackhe.exercise;

/**
*Exercise 2: (1) Create a class containing a float and use it to demonst*rate aliasing.

*@Date:2014/10/28
*@Author:JackHe

*/
//aliasing
class Wallet{
	private float balance;
	public Wallet(float num){
		balance=num;
	}
	public void setBalance(float num){
		this.balance=num;
	}
	public void printBalance(){
		System.out.println("The balance is: "+balance);
	}
}
public class Exe02_02{
	public static void main(String args[]){
		Wallet mine=new Wallet(1234.0f);
		Wallet yours=new Wallet(2345.0f);
		
		mine.printBalance();
		yours.printBalance();
		System.out.println("----------------------------");
		mine=yours;       //give yours wallet to me ):
		System.out.println("After you giving yours to me:");
		System.out.print("mine:");
		mine.printBalance();
		System.out.print("yours:");
		yours.printBalance();
		System.out.println("----------------------------");
		System.out.println("now set yours balance to 100000.0f");
		yours.setBalance(100000.0f);
		System.out.print("mine:");
		mine.printBalance();
		System.out.print("yours:");
		yours.printBalance();
		System.out.println("------------------------------");
		System.out.println("set mine balance to 2000000.0f");
		mine.setBalance(2000000.0f);
		System.out.print("mine:");
		mine.printBalance();
		System.out.print("yours:");
		yours.printBalance();
		
		System.out.println("Oh god, now we share a wallet");
	}
}
