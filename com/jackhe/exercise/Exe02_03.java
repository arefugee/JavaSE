package com.jackhe.exercise;

/**
*Exercise 3: (1) Create a class containing a float and use it to demonstrate aliasing during method calls.

*@Date:2014/10/28
*@Author:JackHe
*/
class KeyCard{
	private int roomNum;   //room mumber show on a keycard of a hotel
	public KeyCard(int RN){
		this.roomNum=RN;
	}

	public void changeRoomNum(int roomN){
		this.roomNum=roomN;
	}
	public int getRoomNum(){
		return roomNum;	
	}
}

class Somebody{
	public static void borrowKeyCard(KeyCard keyCard){
		keyCard.changeRoomNum(120);
	}
}
public class Exe02_03{

	public static void main(String args[]){
		System.out.println("I reserved a hotel room:110");
		KeyCard kc=new KeyCard(110);
		int originalRN=kc.getRoomNum();
		System.out.println("someone borrowed it to open another room,they changed the metadata");
		Somebody.borrowKeyCard(kc);
		System.out.println("Your original RN is:"+originalRN);
		System.out.println("Now you will be led to :"+kc.getRoomNum());


	}
}
