package com.shashank;
import java.util.Arrays;
import java.util.Scanner;
public class SwappingAnArray {

	public static void main(int[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		int i=0;
		int j=arr.length-1;
		reverse(arr,i,j);
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverse(int [] arr,int i,int j) {
		while(!(i>j)) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}

}
