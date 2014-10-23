package com.jackhe.javaSE;

/**
7、编写一个Java程序将当100,101,102,103,104,105个数以数组的形式写入到Dest.txt文件中，并以相反的顺序读出显示在屏幕上。

Date:2014/10/21
Author:JackHe

*/

//IODemo
import java.io.*;
public class J100_07{

	public static void main(String args[]){
		
		int data[]={100,101,102,103,104,105};
		int flag[]= new int[6];
		try{
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("/home/jackhe/javaSE/com/jackhe/javaSE/Dest.txt"));
			for(int i=0;i<data.length-1;i++){
			dos.writeInt(data[i]);
			}
			dos.close();

			DataInputStream dis=new DataInputStream(new FileInputStream("/home/jackhe/javaSE/com/jackhe/javaSE/Dest.txt"));
			for(int i=data.length-1;i>0;i--){
			flag[i]=dis.readInt();
			//System.out.println(data[i]+",");
			}
                        for(int i=0;i<flag.length-1;i++)
			System.out.println(flag[i]+"  ");
			dis.close();
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
}
