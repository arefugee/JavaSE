package com.jackhe.javaSE;
/**
应用FileInputStream类，编写应用程序，从磁盘上读取一个Java程序，并将源程序代码显示在屏幕上。

Date:2014/10/21
Author:JackHe
*/

//FileInputStream

import java.io.*;

public class J100_06{
	public static void main(String args[]){
		byte[] buf=new byte[1024];
		try{
			FileInputStream fileIn=new FileInputStream("/home/jackhe/javaSE/com/jackhe/javaSE/J100_06.java");
			int bytes=fileIn.read(buf,0,1024);
			String str=new String(buf,0,bytes);
			System.out.println(str);
			}catch(Exception e){
		e.printStackTrace();

			}
		}
}
