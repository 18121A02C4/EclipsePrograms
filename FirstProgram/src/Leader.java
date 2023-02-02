import java.util.Scanner;
public class Leader {

	
		public static void main(String[] args) {
//			System.out.println("Hello World");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int [] arr=new int [n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<=arr.length;i++){
			    for(int j=i+1;j<=arr.length-1;j++){
//		            System.out.println(i+" "+j);

			        if(arr[i]>arr[j]){
//			            System.out.println(arr[i]+" "+arr[j]);
			            if(j==arr.length-1){
			                sum+=arr[i];
			                System.out.println(arr[i]);
			            }
			            

			        }
			        else{
			            break;
			        }
			    }
			    
			    
			}
			System.out.println(sum+arr[n-1]);
		}
	



}
