package com.tricks;
import java.util.Scanner;
public class IntegerOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7000009;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			a+=99299;
			System.out.println(a);
		}
	}

}
