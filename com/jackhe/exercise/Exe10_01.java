package com.jackhe.exercise;

/**
*Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. Give it a method called hop( ) that displays which gerbil number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.

*@Date:2014/11/11
*@JackHe:JackHe

*/
import java.util.*;
class Gerbil{
	
	private int gerbilNumber;
	public Gerbil(int i){
		this.gerbilNumber=i;
	}

	public void hop(){

		System.out.println("Gerbil "+this.gerbilNumber+" is hopping...");
	}
}

public class Exe10_01{

	public static void main(String args[]){

		List<Gerbil> gerbilList=new ArrayList<Gerbil> ();

		for(int i=0;i<10;i++){

			Gerbil g=new Gerbil(i);
			gerbilList.add(g);
		}

		for(Gerbil g:gerbilList){
			g.hop();
		}
	}
}
