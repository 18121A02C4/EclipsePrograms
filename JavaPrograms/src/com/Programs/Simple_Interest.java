package com.Programs;
import java.util.Scanner;
public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle_amt,time,rate of interst values");
		float p=sc.nextFloat();
		float t=sc.nextFloat();
		float r=sc.nextFloat();
		double si=(p*t*r)/100;
		System.out.println(si);

		
		

	}

}
