package com.tricks;

public class SwappingUsingWrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		Integer num1=40;
		Integer num2=60;
		//here num is an object of class Integer
		swapWithoutusingWrapper(a,b);
		//here in primitives we are passing only by pass by value not by objects value so swapping doesn't occur
		System.out.println(a+""+b);
		swapusingWrapper(num1,num2);
		System.out.println(num1+""+num2);


		

	}
	static void swapWithoutusingWrapper(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static void swapusingWrapper(Integer a,Integer b) {
		Integer temp=a;
		a=b;//still it wont swap because  
		b=temp;
	}

}
