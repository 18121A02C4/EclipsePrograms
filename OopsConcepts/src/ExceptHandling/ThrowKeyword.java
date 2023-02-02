package ExceptHandling;
import java.util.Scanner;
public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<1) {
			throw new ArithmeticException("not valid age");
		}
		else {
			System.out.println("valid age");
		}

	}//throw keyword is used to throw the exception but with our message

}
