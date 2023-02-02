package ExceptHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
//		int d=a/b;
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("bye");
		}

	}

}
