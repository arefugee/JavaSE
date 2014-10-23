package com.jackhe.javaSE;
/**

To test the accessibility of fileds during inheritance.

Date:2014/10/21
Author:JackHe

*/

class Base{
	private int priInt;
	protected int proInt;
	public int pubInt;

	public Base(){
		priInt=0;
		proInt=1;
		pubInt=2;
	}
}

class Derive1 extends Base{
	public Derive1(){
		super();
		}
	public void accessProtected(){
			System.out.println("Protected field in Derive1 class is: "+proInt);
		}
}

class Derive2 extends Derive1{
	public Derive2(){
		super();
		}
	public void accessProtected(){
		System.out.println("Protected field in Derive2 class is: "+proInt);	
	}
}

public class Accessibility{
	public static void main(String args[]){
		Derive1 d1=new Derive1();
		Derive2 d2=new Derive2();
		d1.accessProtected();
		d2.accessProtected();
		}
}
