import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m1=arr[0];
		int m2=-99999999;
		for(int i=0;i<n;i++) {
			if(arr[i]>m1) {
				m2=m1;
				m1=arr[i];
			}
			else if(arr[i]==m1) {
				continue;
			}
			else if(arr[i]>m2) {
				m2=arr[i];
			}
		}
		System.out.println(m1+" "+m2);
		

	}

}
