import java.util.Arrays;//sub array sum equals k1
import java.util.Scanner;
public class SumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k1=sc.nextInt();//sum k
		int n=sc.nextInt();// length of array
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int [] ans=new int[n*(n+1)/2];//formula for finding no of sub arrays for n length
		int p=0;
		int d=0;
		
		String [] b=new String[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				int sum=0;
				for(int k=i;k<j;k++) {
					sum+=arr[k];
					System.out.print(arr[k]+" ");
					
					}
					if(sum==k1) {
						b[d]=String.valueOf(i+" "+j);
						d+=1;
					
				}
				ans[p]=sum;
				p+=1;
				System.out.println();
			}
		}
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(b));//starting and ending index for printing sub array which equals sum k1


	}

}
