package com.tricks;
import java.util.Scanner;
public class Solution {
//	Shoe bata;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoe[] bata=new Shoe[5];
		
		System.out.println(countTotal(bata,"women"));
		findShoeDesign(bata,"wedges",8);

	}
	public static int countTotal(Shoe[] arr,String category) {
		int c = 0;
		Scanner sc=new Scanner(System.in);

		Shoe[] bata=new Shoe[5];
		System.out.println("enter the values");
		for(int i=0;i<5;i++) {
			bata[i]=new Shoe(sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
		}

//		System.out.println(bata[0].category);

		for(int i=0;i<5;i++) {
			System.out.println(bata[i].category+" "+category);
			if(bata[i].category.equals(category)) {
				c+=bata[i].count;
			}
		}
		return c;
	}
	public static void findShoeDesign(Shoe[] arr,String design,int number) {
		Scanner sc=new Scanner(System.in);

		Shoe[] bata=new Shoe[5];
		System.out.println("enter the values");
		for(int i=0;i<5;i++) {
			bata[i]=new Shoe(sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
		}

		for(int i=0;i<5;i++) {
			if((bata[i].design.equals(design))&&(bata[i].number==number)) {
				System.out.println(bata[i].count+"#"+bata[i].category);
			}
		}
	}

}
 class Shoe{
	int number;
	int count;
	String category;
	String design;
	public Shoe(int n1,int n2,String s1,String s2) {
		this.number=n1;
		this.count=n2;
		this.category=s1;
		this.design=s2;
	}
}

