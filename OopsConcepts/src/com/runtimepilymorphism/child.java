package com.runtimepilymorphism;

public class child extends Parent {
	@Override
	public  void display() {
		System.out.println("hello child");
	}
	public void display(String s1) {
		System.out.println(s1);
	}

}
