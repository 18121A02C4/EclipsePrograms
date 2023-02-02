package com.runtimepilymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();

		obj.display();
		obj.display("hurray");
		//static methods cannot be overridden becoz overriding depends on objects we can call static methods either by using class name or object name so no mattter for which class we create obj either it is a parent class or child class the static method will always run when we call it by using "class name".

	}

}
