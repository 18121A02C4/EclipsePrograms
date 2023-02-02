package ExceptHandling;

public class Null_Pointer {
	int a=1;
	static Null_Pointer ob;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Null_Pointer ob=new Null_Pointer();
		 ob=null;//the ref of Object(new Null_Pointer)is pointing towards null
		System.out.println(ob);
		System.out.println(ob.a);

	}

}
