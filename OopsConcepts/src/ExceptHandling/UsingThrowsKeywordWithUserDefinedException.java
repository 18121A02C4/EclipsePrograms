package ExceptHandling;

import java.util.Scanner;

public class UsingThrowsKeywordWithUserDefinedException extends Exception {
	 String s;
	public UsingThrowsKeywordWithUserDefinedException(String s) {
		super(s);
//		this.s=s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
//		int c;
	   
		try {
			call(a,b);
		}
		catch(UsingThrowsKeywordWithUserDefinedException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}
	public static void call(int c,int d) throws UsingThrowsKeywordWithUserDefinedException {
		if(d==0) {
			throw new  UsingThrowsKeywordWithUserDefinedException("division by zerooo");
		}
		else {
			System.out.println(c/d);
		}
	}

}

