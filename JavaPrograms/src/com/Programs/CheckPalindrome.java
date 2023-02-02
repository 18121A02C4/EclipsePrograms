package com.Programs;
import java.util.Scanner;
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r+=s.charAt(i);
		}
		if(r.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
