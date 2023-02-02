package com.coding;

import java.util.Scanner;


public class Main {
//	Shoe1 bata;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		Shoe1[] bata=new Shoe1[5];
		System.out.println("enter the values");
		for(int i=0;i<5;i++) {
			bata[i]=new Shoe1(sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
		}
		
		System.out.println(countTotal(bata,"women"));
		findShoe1Design(bata,"wedges",8);

	}
	public static int countTotal(Shoe1[] arr,String category) {
		int c = 0;
		

//		Shoe1[] bata=new Shoe1[5];
		System.out.println("hello");
//		System.out.println(bata[0].category);

		for(int i=0;i<5;i++) {
//			System.out.println(arr[i].category+" "+category);
			if(arr[i].category.equals(category)) {
				c+=arr[i].count;
			}
		}
		return c;
	}
	public static void findShoe1Design(Shoe1[] arr,String design,int number) {
		Scanner sc=new Scanner(System.in);

//		Shoe1[] bata=new Shoe1[5];
//		System.out.println("enter the values");
//		for(int i=0;i<5;i++) {
//			bata[i]=new Shoe1(sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
//		}

		for(int i=0;i<5;i++) {
			if((arr[i].design.equals(design))&&(arr[i].number==number)) {
				System.out.println(arr[i].count+"#"+arr[i].category);
			}
		}
	}

}