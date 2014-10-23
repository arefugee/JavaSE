package com.jackhe.exercise;
/**
(1) Turn the Incrementable code fragments into a working program.

@Date:2014/10/23
@Author:JackHe

*/

class StaticTest{
	public static int i=47;
}

class Incrementable{
	public static int increment(){
	return StaticTest.i++;
	}
}

public class Exe01_07{
	public static void main(String args[]){

		for(int i=0;i<10;i++){
		System.out.println(Incrementable.increment());
	}
	}
}
