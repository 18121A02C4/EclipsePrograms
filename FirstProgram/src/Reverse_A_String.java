import java.util.Arrays;
import java.util.Scanner;
public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String [] arr= {"v","e","e","r","a"};
		int i=0;
		int j=arr.length-1;
		while(!(i>j)) {
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	
	
	}
}

