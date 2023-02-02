package ExceptHandling;

public class Error_and_Throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
		}
		catch(Throwable e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("hello");
		}
		try {
			int[] b=new int[5];
			System.out.println(b[5]);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("bye");
		}

	}

}
