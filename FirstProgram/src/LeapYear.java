import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ans="";
		ans=( (n%4==0)?((n%100==0)?((n%400==0)?"leap":"nonleap"):"leap"):"nonleap");
		System.out.println(ans);
		
			

	}

}
