import java.util.Scanner;
public class Trim
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
//		String s=sc.next().trim();
//		String s=sc.nextLine();
//		String s=sc.next().trim();
		int n=sc.nextInt();
		int i=String.valueOf(n).length()-1;
//		int i=0;
		int rev=0;
		while(n>0) {
			rev+=((n%10)*Math.pow(10,i));
//			i++;
			i--;
			n/=10;
		}
		System.out.println(rev);

//		System.out.println(Math.pow(n,i));
	}

	
}