import java.util.Scanner;
public class Duplicate{

	public static void main(String[] args) {
	//	System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		int [] arr=new int[26];
		for(int i=0;i<s1.length();i++){
		    if (arr[(int) s1.charAt(i)-97]<1){
		        s2+=s1.charAt(i);
		    }
		    arr[(int) s1.charAt(i)-97]+=1;
		}
		System.out.println(s2);
		for(int i=0;i<arr.length;i++){
		    if (arr[i]==1){
		        System.out.print((char) (i+97));
		    }
		}
		System.out.println();
		for(int i=0;i<s2.length();i++){
		    	System.out.print(s2.charAt(i)+""+ arr[(int) s2.charAt(i)-97]);
		    
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>0){
		        System.out.print((char) (i+97)+""+arr[i]);
		    }
		    
		}
		System.out.println();
		for(int i=0;i<s2.length();i++){
		    if(arr[(int) s2.charAt(i)-97]>1){
		        System.out.print((char) ((int) s2.charAt(i)));//directly(s2.charAt(i)(for repeating chars)
		    }
		}
		System.out.println();
		for(int i=0;i<s2.length();i++){
		    if(arr[(int) s2.charAt(i)-97]==1){
		        System.out.print( s2.charAt(i));//directly(s2.charAt(i)(for repeating chars)
		    }
		}
		
		
		
		
	}
}
