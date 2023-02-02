package ExceptHandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3};
		try {
//			int c=10/0;
			try {
				System.out.println(a[8]);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
