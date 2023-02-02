import java.util.Scanner;
public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of the digits the otp has to be");
		double n=sc.nextInt();
		double maxi= Math.pow(10, n);
		double mini= Math.pow(10, n-1);
		int otp=(int) Math.floor(Math.random()*(maxi-mini+1)+mini);
		System.out.println(otp);
		
	

	}

}
