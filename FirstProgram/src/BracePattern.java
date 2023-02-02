import java.util.*;
public class BracePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				if((i+j)%2==0) {
					System.out.print("><");
				}
				else {
					System.out.print("<>");
				}
			}
			System.out.println();
			
		}
		

	}

}
