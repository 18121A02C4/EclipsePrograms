
public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(j==1||j==10||i+j==11||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
