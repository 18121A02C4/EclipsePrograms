import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="";
//		int n=sc.nextInt();
//		sc.nextLine();//to eliminate skipping of s1 string input
		String s1=sc.nextLine();
		System.out.println("hello");
		for(int i=s1.length()-1;i>=0;i--) {
			s+=s1.charAt(i);
		}
		System.out.println(s);
		
		

	}

}
