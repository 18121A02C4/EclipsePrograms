package com.polymorphism;

public class MethodOverloading {
	public String add(String s1,String s2) {
		return s1+s2;
	}
	public int add(int a1,int a2) {
		return a1+a2;
	}
	public int add(int a1,int a2,int a3) {
		return a1+a2+a3;
	}
	public static void name(String s1) {
		System.out.println(s1);
	}


}
