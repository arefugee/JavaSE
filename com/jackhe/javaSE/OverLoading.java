/**
1.different parameters list
2.different parameter order
3.different parameter type

other than above cases is not overloading.

Date:2014/10/22
Author:JackHe
*/

class Test{
	public void function(int i, int j){

		System.out.println("parameters:int->"+i+" int-> "+j);
	}
	public void function(int i,String j){
		System.out.println("parameters:int->"+i+" String-> "+j);
	}
	public void function(String j, int i){
		System.out.println("parameters:String->"+i+" int-> "+i);
	}
}

public class OverLoading{
	public static void main(String args[]){

		Test test=new Test();
		test.function(1,2);
		test.function(1,"helloworld");
		test.function("helloworld",1);
	}
}

