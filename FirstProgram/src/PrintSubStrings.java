import java.util.Scanner;
public class PrintSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String s1="";
				for(int k=i;k<j;k++) {
					s1+=s.charAt(k);
				}
				System.out.println(s1);
			}
		}

	}

}
