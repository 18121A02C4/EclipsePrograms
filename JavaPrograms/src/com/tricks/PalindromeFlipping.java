package com.tricks;
import java.util.Scanner;
public class PalindromeFlipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		System.out.println(n);
		String j=String.valueOf(n);
//		System.out.println( j instanceof String);
		int l=j.length()-1;
		String s1=" ";
		System.out.println(String.valueOf(n).substring(0));

		for(int i=0;i<String.valueOf(n).length();i++) {
			if(String.valueOf(j.charAt(i)).equals(j.charAt(l))) {
				System.out.println("if");
				System.out.println(j.charAt(i)+" "+j.charAt(l));
				 s1=j;
				 break;
				
			}
			else {
				System.out.println("else");
				String end=String.valueOf(~(Integer.parseInt(String.valueOf(j.charAt(l))))+2);
				System.out.println(end);
				s1=j.substring(i,l)+end;
				System.out.println(j.substring(0,l));
				break;
			}
		}
//		static boolean countZeroAndOne(String s) {
//			return true;
//		}
//		while(isPalindriome)
		System.out.println(s1+"hello");

	}
	

}
