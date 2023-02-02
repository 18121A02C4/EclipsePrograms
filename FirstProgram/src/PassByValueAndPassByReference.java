import java.util.Arrays;
import java.util.Scanner;
public class PassByValueAndPassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		swap(a,b);
		String name="hello";
		int [] arr= {2,4,6,0};
		change(name);
		System.out.println(changeValue(arr));
		System.out.println(a+" "+b);
		int f=100;
		{
			f=1000;
			
		}
		System.out.println(f);
		System.out.println(name);

	}
	static void swap(int a,int b) {//pass by values so original values wont change
		int temp=a;
		a=b;
		b=temp;
	}
	static String changeValue(int[] arr) {//pass by value of the object so original value changes
		arr[0]=1;
		return Arrays.toString(arr);
		
	}
	static void change(String naam) {// a new object will be created for naam but the original won't change becoz strings are immutable.
		
		naam="kiran";
		System.out.println(naam);

	}

}
