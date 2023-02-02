package ExceptHandling;
import java.util.Scanner;
public class UsingThrowsKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
	   
		try {
			call(a,b);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	public static int call(int c,int d) throws ArithmeticException {
		return c/d;
	}

}
