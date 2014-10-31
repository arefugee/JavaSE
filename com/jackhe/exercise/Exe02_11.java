package com.jackhe.exercise;

/**
*Exercise 11: (3) Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant). Using the signed right-shift operator, right shift it all the way through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).

*@Date:2014/10/31
*@Author:JackHe

*/

public class Exe02_11{
	public static void main(String args[]){
		int i=0x80000000;
//		int i3=-0x80000000;
//		System.out.println(Integer.toBinaryString(i3));
	//	int i1=80000000;
	//	int i2=-80000000;
	//	System.out.println("i2:"+Integer.toBinaryString(i2));
	//	System.out.println("i1:"+Integer.toBinaryString(i1));
		System.out.println(Integer.toBinaryString(i));

		for(int j=0;j<31;j++){
			i>>=1;
			System.out.println(Integer.toBinaryString(i));
		}	
	}

}
