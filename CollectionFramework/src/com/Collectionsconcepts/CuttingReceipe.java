package com.Collectionsconcepts;
import java.util.*;
public class CuttingReceipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> arr=new ArrayList<>();
			arr.add(sc.nextInt());
			int a=arr.get(0);
			int m=0;
			int v=1;
			int gcd=1;
 
			while(a>0) {
				arr.add(sc.nextInt());
			
				if(arr.get(v)>m) {
					m=arr.get(v);
				}
				v+=1;
				a-=1;
			}
			System.out.println(arr);
			System.out.println(m);
			for(int k=1;k<=m;k++) {
				int f=0;
				for(int p=1;p<arr.size();p++) {
					if(arr.get(p)%k==0) {
						f++;
					}
					else {
						break;
					}
				}
				if(f==arr.size()-1) {
					 if(k>gcd) {
						 gcd=k;
					 }
				}
			
			}
			System.out.println(gcd);
			for(int r=1;r<arr.size();r++) {
				arr.set(r, arr.get(r)/gcd);
			}
			System.out.println(arr);
			
		}
		
		

	}

}
