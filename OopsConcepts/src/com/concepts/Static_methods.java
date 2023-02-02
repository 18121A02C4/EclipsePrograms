package com.concepts;

public class Static_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_methods ob1=new Static_methods();
		greeting();
		
		
		

	}
	void fun(int a,String h) {
		System.out.println("fun"+a+h);
		System.out.println(a);
		hello();
	}
	static void greeting() {
		System.out.println("hello");
		Static_methods ob1=new Static_methods();

		ob1.fun(2,"fun");
	}
	void hello() {
		System.out.println("hello world");
	}

}

