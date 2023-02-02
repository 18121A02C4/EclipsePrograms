
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String [] arr=new String[100];
		int i=0;
		String input=sc.next();
		while(!(input.equals("hello"))){
			System.out.println(sc.next()!="hello");

		    arr[i]=sc.next();//NOT GETTING OUTPUT
		    i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}