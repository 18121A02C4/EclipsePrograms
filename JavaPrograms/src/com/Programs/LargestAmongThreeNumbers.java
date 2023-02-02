package com.Programs;
import java.util.Scanner;
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int maxi=a;
		if(b>a) {
			if (b>c) {
				maxi=b;
			}
			else {
				maxi=c;
			}
		}
		else if(c>a){
			if(c>b) {
				maxi=c;
			}
			else {
				maxi=b;
				
			}
		}
		System.out.println(maxi);


	}

}
