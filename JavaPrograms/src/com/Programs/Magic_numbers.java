package com.Programs;
import java.util.*;//incomplete leave it.
public class Magic_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		String s2=s;
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s1);
		for(int i=s.length()-1;i>=0;i--) {
			if(s.equals(s1)) {
				System.out.println(s1);
				break;
			}
			else {
				s1+=s.charAt(i);
			}
		}
		

	}

}
