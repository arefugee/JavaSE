package com.jackhe.exercise;
/**
Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.

*@Date:2014/10/23
*@Author:JackHe
*/

public class Exe01_09{
        public static void main(String args[]){
                int i=123;
                Integer I=i;
                System.out.println("autoboxing->Int:"+I);
                char ch='a';
                Character CH=ch;               
		 System.out.println("autoboxing->Char:"+CH);
                byte b=8;
                Byte B=b;
                System.out.println("autoboxing->Byte:"+B);
                short sh=9;
                Short SH=sh;
                System.out.println("autoboxing->Short:"+SH);
                float f=1.0f;
                Float F=f;
                System.out.println("autoboxing->Float:"+F);
                double d=2.3d;
                Double D=d;
                System.out.println("autoboxing->Double:"+D);
                boolean bool=true;
                Boolean BOOL=bool;
                System.out.println("autoboxing->Boolean:"+BOOL);
                long lon=3l;
                Long LON=lon;
                System.out.println("autoboxing->Long:"+LON);
        }
}
