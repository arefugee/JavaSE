package com.jackhe.exercise;

/**
*Exercise 8: (2) Create a switch statement that prints a message for each case, and put the switch inside a for loop that tries each case. Put a break after each case and test it, then remove the breaks and see what happens.

*@Date:2014/11/01
*@Author:JackHe

*/

public class Exe03_08{

	public static void main(String args[]){
		for(int i=0;i<5;i++){

			switch(i){
				case 0: System.out.println(i);
			//		break;
				case 1:	System.out.println(i);
			//		break;
				case 2: System.out.println(i);
			//		break;
				case 3: System.out.println(i);
			//		break;
				case 4: System.out.println(i);
			//		break;
				default:System.out.println("none of the numbers is in the loop");
			}
		}
	}
}
