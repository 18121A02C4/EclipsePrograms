import java.util.*;
public class AvgOfElemnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
//		System.out.println(11/2);
		int [] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		if(n%2==0) {
			System.out.println((arr[0]+((arr[n/2]+arr[n/2+1])/2)+arr[n-1])/3);
		}
		else {
			System.out.println((arr[0]+arr[n/2]+arr[n-1])/3);
		}
	}

}
