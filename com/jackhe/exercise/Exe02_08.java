package com.jackhe.exercise;

/**
*Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.

*@Date:2014/10/31
*@Author:JackHe
*/

public class Exe02_08{

	public static void main(String args[]){
		long L1=0x2f;  //lowercase
		System.out.println("L1:"+ Long.toBinaryString(L1));
		long L2=0x2F;  //
		System.out.println("L2:"+Long.toBinaryString(L2));
		long L3=0X2f;
		System.out.println("L3:"+Long.toBinaryString(L3));
		long L4=0X2F;
		System.out.println("L4:"+Long.toBinaryString(L4));
		long L5=0177;  //octal,with leading 0
		System.out.println("L5:"+Long.toBinaryString(L5));
	}
}
