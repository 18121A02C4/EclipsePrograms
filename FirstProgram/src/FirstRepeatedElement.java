import java.util.*;
public class FirstRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr1=new int[8];
		for(int i=0;i<=7;i++) {
			arr1[i]=sc.nextInt();
		}
		int [] arr2=new int[8];
		int mini=2;
		  int ans=0;
		for(int i=0;i<=7;i++) {
			for(int j=i+1;j<=7;j++) {
				if(arr1[i]==arr1[j]) {
					arr2[i]+=(j-i);
					break;
					
				
				}
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr2.length-1;i++) {
			if(arr2[i]>arr2[i+1]  ) {
				ans=arr1[i];
			}
			else if(arr2[i]==0) {
//				System.out.println(arr1[i-1]);
//				break;
				continue;
			}
			else {
//				System.out.println(ans);
//				break;
				continue;
			}
		}
		System.out.println(ans);

		

	}

}
