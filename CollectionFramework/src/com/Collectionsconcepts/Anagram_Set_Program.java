package com.Collectionsconcepts;
import java.util.*;
public class Anagram_Set_Program {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		String a="eat";
//		char[] ch=a.toCharArray();
		HashMap<ArrayList,String> p=new HashMap<>();
		Set<Set> hans1=new HashSet<>();
		List<ArrayList>hans=new ArrayList();
		for(int i=0;i<6;i++) {
			String s1=sc.next();
			char[] ch=s1.toCharArray();
			Set<Character>hs=new HashSet<>();
			ArrayList<Character> hs1=new ArrayList<>();
			for(char e:ch) {
				hs.add(e);
			}
			for(char e:ch) {
				hs1.add(e);
			}
//			Set<String> hs=new HashSet<>();
//			ArrayList<String> hs1=new ArrayList<>();
//			hs.add(s1);
//			hs1.add(s1);
			hans1.add(hs);
			hans.add(hs1);
			p.put( hs1,s1);
			}
		System.out.println(p);
		System.out.println(hans1);
		System.out.println(hans);

		List<ArrayList<String>>l1=new ArrayList();
		List<Set>l3=new ArrayList();
		int k=0;
		
		for(Set w:hans1) {
			List<String>l=new ArrayList();
			for(int i=0;i<hans.size();i++) {
//				System.out.println(w+" "+hans.get(i));
				if(w.containsAll(hans.get(i))) {
//					System.out.println("hello");
					l.add(p.get(hans.get(i)));
//					hans.remove(hans.get(i));
				}

			}
			l1.add( (ArrayList) l);
		}
		System.out.println(l1);
////		
		
		
		
//		String s1="has";
//		String s2="has";
//		HashMap<String,String> h=new HashMap<>();
//		ArrayList<String>a=new ArrayList<String>();
//		System.out.println(s1.contains(s2));
//		for(int i=0;i<6;i++) {
//			String s=sc.next();
//			char[] ch=s.toCharArray();
//			Arrays.sort(ch);
//			String sh=String.valueOf(ch);
//			h.put(s,sh);
//			System.out.println(sh);
//			a.add(sh);
//		}
//		Collections.sort(a);
//		System.out.println(a);
//		ArrayList<String> l=new ArrayList();
//		ArrayList<ArrayList<String>> l1=new ArrayList();
//
//		for(int i=0;i<a.size()-1;i++) {
//			if(a.get(i).equals(a.get(i+1))) {
//				System.out.println(a.get(i)+" "+a.get(i+1));
//				l.add(a.get(i));
//			}
//			else {
//				System.out.println(a.get(i)+" "+a.get(i+1));
//
//				l.add(a.get(i));
//				l1.add(l);
//				 l=new ArrayList();
//			}
//			if(i==a.size()-2) {
//				if(a.get(i).equals(a.get(i+1))){
////					l.add(a.get(i));
//					l.add(a.get(i+1));
//					l1.add(l);
//					
//				}
//				else {
////					l1.add(l);
//					l=new ArrayList();
//					l.add(a.get(i+1));
//					l1.add(l);
//				}
//				
//			}
//		}
//		System.out.println(h);
//		System.out.println(l1);
//		ArrayList<ArrayList<String>> h1=l1;
//		System.out.println(h1);
//		ArrayList<ArrayList<String>> ans=new ArrayList();
//		ArrayList<String> v=new ArrayList<>();
//
//		for(int i=0;i<l1.size();i++) {
//			ArrayList<String> u=l1.get(i);
//
//			for(int j=0;j<u.size();j++) {
//				v.set(j, h.get(u.get(j)));
//			}
//			ans.add(v);
//		}
//		System.out.println(ans);


	}

}
