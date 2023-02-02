package com.Collectionsconcepts;
import java.util.*;
public class Numbers_Count_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a="1";
		String b="11";
		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>();

		if(n==1) {
			System.out.println("1");
		}
		else if(n==2) {
			System.out.println(b);
		}
		else {
			for(int i=3;i<=n;i++) {
//				System.out.println(b);
				l=new ArrayList<>();
				l1=new ArrayList<>();
				for(int j=0;j<b.length();j++) {
					l1.add(Integer.parseInt(String.valueOf(b.charAt(j))));
					if (!(l.contains(Integer.parseInt(String.valueOf(b.charAt(j)))))){
						l.add(Integer.parseInt(String.valueOf(b.charAt(j))));
					}
					
				}
				b="";
				for(int j=0;j<l.size();j++) {
					b+=String.valueOf(Collections.frequency(l1, l.get(j)))+String.valueOf(l.get(j));
				}
//				System.out.println(b);
//				System.out.println(l);
//				System.out.println(l1);
			}
		}
		System.out.println(b);
//		System.out.println(l);
//		System.out.println(l1);
//		if((n-3)>=1) {
//			String b1="";
//			for(int i=1;i<b.length();i+=2) {
//				int j=i;
//				while(j>0) {
//					b1+=b.charAt(i-1);
//					j--;
//				}
//			}
//			System.out.println(b1);
//		}
//		else {
//			System.out.println(b);
//
//		}
//		String ch="a";
//		System.out.println();
		
		

	}

}
