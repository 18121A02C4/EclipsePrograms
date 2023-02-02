import java.util.Arrays;//program to print second most repeated character in the given string
import java.util.Scanner;
public class CountFreqOfStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int [] arr=new int[s1.length()];
		
		char h=' ';
		for(int i=0;i<s1.length();i++) {
			int c=0;

			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					c+=1;
				}
			}
			arr[i]=c;
		}
		int m1=arr[0];
		int m2=-9999999;
		int index=0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]>m1) {
				m2=m1;
				m1=arr[i];
			}
			else if(arr[i]==m1) {
				continue;
			}
			else if(arr[i]>m2) {
				m2=arr[i];
				index=i;
			}
		}
		System.out.println(m1+" "+m2);
		System.out.println(s1.charAt(index));
		System.out.println(Arrays.toString(arr));
		

	}

}
