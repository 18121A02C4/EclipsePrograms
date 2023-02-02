package com.tricks;
import java.util.Scanner;
public class SkippingNextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a line");
		String s=sc.nextLine();
		System.out.println("enter a name");
		String s2=sc.next();
		System.out.println("enter your age");
		int n=sc.nextInt();
		System.out.println("enter your country");
//		String s3=sc.next();
//		System.out.println("enter dob");
//		int n1=sc.nextInt();
		System.out.println("enter about yourself");
		String d="";//instead of taking input it skips input as soon as we press enter after taking dob it closes as it reads \n in nextLine method and closes it.
		System.out.println("oops skipped a input");
		System.out.println(d);
		sc.close();

	}

}
