import java.util.Arrays;
import java.util.Scanner;
public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(isPrime(n1));

		System.out.println(primeNo(n1,n2));
		


	}
	static  boolean isPrime(int h) {
		if(h>1) {
			for(int i=2;i<h;i++) {
				if(h%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	static int [] primeNo(int n1,int n2) {
		int k=0;
		int [] arr=new int[100];


		for(int i=n1;i<=n2;i++) {
			if(i>1) {
				int flag=0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						flag+=1;
						break;
					}
				}
				if(flag<1) {
					arr[k]=i;
					k+=1;
					System.out.print(i);
				}
			}
		}
		return arr;//unable to return arr find how to return an array
	}

}
