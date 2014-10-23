package com.jackhe.exercise;

/**
Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main( ).

@Date:2014/10/23
@Author:JackHe

*/
class DataOnly{
 private int i;
 private double d;
 private boolean b;

public DataOnly(int i, double d,boolean b){
	this.i=i;
	this.d=d;
	this.b=b;
	}	
	public void printField(){

	System.out.println("vlaue of fields in a class:int->"+i	+",double->"+d+",boolean->"+b);
	}

}

public class Exe01_05{
        public static void main(String args[]){
                DataOnly dataonly=new DataOnly(1,1.1,true);

		dataonly.printField();              
     }
}


