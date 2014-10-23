package com.jackhe.javaSE;
/**

calculate the sum of 1!+2!+..+10!

Date:2014.10.16
Author:JackHe
*/
//Sum
public class J100_03{
	public static void main(String args[]){
	int i=0,j=0,sum=0;
	for(i=1;i<=10;i++){
	int product=1;
	for(j=1;j<=i;j++){
		product*=j;
	}
	sum+=product;
		}
	System.out.println("The sum of 1!+2!+..+10! is:\n"+sum);
			}
}
