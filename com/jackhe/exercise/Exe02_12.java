package com.jackhe.exercise;

/**
*Exercise 12: (3) Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift operator to right shift through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).

*@Date:2014/10/31
*@Author:JackHe

*/

public class Exe02_12{

	public static void main(String args[]){
		int i=-1;

		System.out.println(Integer.toBinaryString(i));
		i<<=1;
		System.out.println(Integer.toBinaryString(i));
/*		
		for(int j=0;j<31;j++){

			i>>=1;
			System.out.println(Integer.toBinaryString(i));
		}
*/
		System.out.println("----------------------------------");
		for(int j=0;j<31;j++){
			i>>>=1;
			System.out.println(Integer.toBinaryString(i));
		}
		
	}
}
