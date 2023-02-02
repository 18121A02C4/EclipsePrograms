package com.Programs;
import java.util.Scanner;
public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxi=arr[0];
		int k=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>maxi) {
				maxi=arr[i];
				k=i;
			}
		}
		System.out.println(maxi+" "+k);

	}

}
