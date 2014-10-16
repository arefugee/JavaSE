/**
Justify if a year a leap year or not

Date:2014.10.16
Author:JackHe
*/
//LeapYear

import java.util.Scanner;

public class J100_02{
	
	 public static void main(String args[]){
	int year=0;	
	while(true){
		System.out.println("Please input the year:\n");
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		if(temp<=0)
		System.out.println("Wrong input,try again:");
		else{
		year=temp;
		break;
			}
		}
	if((year%4==0&&year%100==0)||(year%400==0))
	System.out.println(year+" is a leap year !");
	else
	System.out.println(year+" is not a leap year!");
			
}
}
