package com.shashank;
import java.util.Scanner;
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numb(78);
		numb("hello");
		numb(1,2,3);

	}
	static void numb(int n) {
		int n1=n;
		System.out.println(n1);
	}
	static void numb(String s) {
		String s2=s;
		System.out.println(s);
	}
	static void numb(int n,int n2,int n3) {
		int n1=n;
		System.out.println(n1);
	}

}
