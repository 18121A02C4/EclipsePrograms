import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
			
		}

	}

}
