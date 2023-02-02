package ExceptHandling;
import java.util.Scanner;
 class UserDefinedExceptionUsingThrow extends Exception {
//	 String s;
	public UserDefinedExceptionUsingThrow(String s) {
		super(s);
//		this.s=s;
	}

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try {
			
		
		if(a<1) {
			throw new UserDefinedExceptionUsingThrow("not valid input");
		}
		}
		catch(UserDefinedExceptionUsingThrow e) {
			System.out.println(e);//ExceptHandling.UserDefinedExceptionUsingThrow: not valid input

			System.out.println(e.getMessage());//not valid input
			e.printStackTrace();

		}

	}

}
