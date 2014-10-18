/**
Date:2014/10/17
Author:JackHe
*/

class Circle{
	
	private double radius;
	
	public Circle(){
		radius=0;
		}
	public Circle(double r){
		radius=r;
		}
//get area
	protected double getArea(){
		return Math.PI*radius*radius;		
}
//get Perimeter
	private double getPerimeter(){
		return 2*Math.PI*radius;
		}
//print the area,perimeter...to screen
	public void show(){
		System.out.println("The circle's radius is "+radius);
		System.out.println("The perimeter of the circle is :"+getPerimeter());
		System.out.println("The Area of the circle is:"+getArea());
		}
	
}

class Cylinder extends Circle{
	
	private double hight;
	public Cylinder(double r,double h){
		super(r);
		hight=h;
		}
//get volume
	private double getVolume(){
		return getArea()*hight;
		}
//print the voluem to screen
	public void showVolume(){
		System.out.println("The volume of the cylinder is:"+getVolume());
		}
}

public class J100_04{

	public static void main(String args[]){
		Circle ci=new Circle(10.0);
		ci.show();
		Cylinder cyl=new Cylinder(5.0,10.0);
		cyl.show();
		cyl.showVolume();	
	}

}
