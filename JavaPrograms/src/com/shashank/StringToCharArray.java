package com.shashank;
import java.util.Scanner;
public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char [] ch=s.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		sc.close();

	}

}
