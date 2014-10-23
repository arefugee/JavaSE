/**
Exercise 6: (2) Write a program that includes and calls the storage( ) method defined as a code fragment in this chapter.

@Date:2014/10/23
@Author:JackHe
*/

class FunctionOnly{
	public int storage(String string){
		return string.length()*2;
	}
}

public class Exe01_06{
	public static void main(String args[]){
		FunctionOnly fo=new FunctionOnly();
		
		int num=fo.storage("Hello Java!");
		System.out.println(num);
	}
}
