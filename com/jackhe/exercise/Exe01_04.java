package com.jackhe.exercise;
/**
*
(1) Turn the DataOnly code fragments into a program that compiles and runs.

@Date:2014/10/23
@Author:JackHe

*/

class DataOnly{
 public int i;
 public double d;
 public boolean b;
}

public class Exe01_04{
	public static void main(String args[]){
		DataOnly dataonly=new DataOnly();
		
		System.out.println("default vlaue of fields in a class:int->"+dataonly.i+",double->"+dataonly.d+",boolean->"+dataonly.b);
	}
}
