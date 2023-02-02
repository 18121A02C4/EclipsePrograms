package com.Collectionsconcepts;
import java.util.*;
public class PractiseCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		adq.offer(23);
		adq.offer(90);
		adq.offer(990);
		adq.offer(909);
		adq.poll();
		System.out.println(adq);
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		Set<Integer>set =new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(5);
		set.add(1);//won't take duplicate elements
		System.out.println(set);//enetered order not following
		set.remove(5);
		System.out.println(set);
		Set<Integer>set1 =new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(8);
		set1.add(1);
		set1.add(2);
		set1.add(3);//won't take duplicate elements
		System.out.println(set1);//enetered order will following
		set1.remove(5);
		System.out.println(set1);
		Set<Integer>set2 =new TreeSet<>();
		set2.add(9);
		set2.add(6);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(8);
		set2.add(1);//won't take duplicate values
		set2.add(2);//entered elements will print in sorted order
		System.out.println(set2);
		Map<Integer,String> names=new HashMap<>();
		names.put(9, "nine");
		names.put(1,"one");
		names.put(2,"two");
		names.put(2,"three");
		names.put(99, "nintynine");
		names.put(4,"four");
		names.put(6,"six");
		names.put(78, "seventyeight");
		names.put(5,"five");//the entered values will be in random order
		names.put(7,"seven");
		names.put(0, "zero");
		System.out.println(names);
		System.out.println(names.containsKey(99));
		System.out.println(names.containsKey(87));
		System.out.println(names.containsValue("seventyeight"));
		System.out.println(names.containsValue("forty"));
		System.out.println("getting values using key");//"getting values using key"
		System.out.println(names.get(5));
		for (int i : names.keySet()) {
			  System.out.print(i+" ");
			}
		System.out.println();
		for (String i : names.values()) {
			  System.out.print(i+" ");
			}
		System.out.println();
		for(int i=0;i<names.size();i++) {
			
		}
		Map<Integer,String> names1=new TreeMap<>();
		names1.put(9, "nine");
		names1.put(1,"one");
		names1.put(2,"two");
		names1.put(2,"three");
		names1.put(99, "nintynine");
		names1.put(4,"four");
		names1.put(6,"six");
		names1.put(78, "seventyeight");
		names1.put(5,"five");//the entered values will be in sorted in the order of key
		names1.put(7,"seven");//if key is integer in ascending
		names1.put(0, "zero");//if key is string in alphabetical
		System.out.println(names1);//here names are sorted in the order of key
		System.out.println(names1.containsKey(99));
		System.out.println(names1.containsKey(87));
		System.out.println(names1.containsValue("seventyeight"));
		System.out.println(names1.containsValue("forty"));
		List<Integer> l=new ArrayList<>();
		l.add(6);
		l.add(7);
		l.add(4);
		l.add(1);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Comparator.reverseOrder());
		System.out.println(l);
		


		
		
		



		

	}

}
