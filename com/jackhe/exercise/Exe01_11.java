package com.jackhe.exercise;
/**
Exercise 11: (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.

@Date:2014/10/27
@Author:JackHe

*/

//camel-casing
class AllTheColorsOfTheRainbow{

	private int anIntegerRepresentingColors;
	public void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors=newHue;
	}
		
	public void printTheHueOfTheColor(){
		System.out.println("The hue of the color is:"+anIntegerRepresentingColors);
	}
}
public class Exe01_11{

	public static void main(String args[]){
		AllTheColorsOfTheRainbow shit=new AllTheColorsOfTheRainbow();
		shit.changeTheHueOfTheColor(24);  //I am 24 years old
		shit.printTheHueOfTheColor();
	}
}
