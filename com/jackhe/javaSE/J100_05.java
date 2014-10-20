/**
5、编写一个Java应用程序，从键盘读取用户输入两个字符串，并重载3个函数分别实现这两个字符串的拼接、整数相加和浮点数相加。要进行异常处理，对输入的不符合要求的字符串提示给用户，不能使程序崩溃。

Date:2014/10/18
Author:JackHe

*/
import java.io.*;

public class J100_05{
	public static void main(String args[]){
		 String s1="",s2="",s2i="",s2f="",ss="";
		 int i1=0,i2=0;
		 float f1=0,f2=0;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		try{
		System.out.println("input the first string:");
		s1=br.readLine();
		System.out.println("input the second string");
		s2=br.readLine();
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
		try{
		i1=Integer.parseInt(s1);
		i2=Integer.parseInt(s2);
		f1=Float.parseFloat(s1);
		f2=Float.parseFloat(s2);
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
		System.out.println("sum of String: "+strAdd(s1,s2));
		System.out.println("sum of int: "+strAdd(i1,i2));
		System.out.println("sum of float: "+strAdd(f1,f2));
		
}
	private static String strAdd(String s1,String s2){
		return s1+s2;
		}

	private static String strAdd(int int1,int int2){
		return String.valueOf(int1+int2);
	}
	private static String strAdd(float f1,float f2){
	 	return String.valueOf(f1+f2);
}

}
