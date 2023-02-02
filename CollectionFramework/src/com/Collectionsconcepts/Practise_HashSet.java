package com.Collectionsconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practise_HashSet {
	public static void main(String[] args) {
		Set<Integer>set =new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(5);
		System.out.println(set);
		ArrayList<Integer> a=new ArrayList(Arrays.asList(set));
		System.out.println(a);
		int[] arr= {9,8,7,6,5};
		ArrayList<Integer> a1=new ArrayList(Arrays.asList(arr));
		System.out.println(a1);
	}

}
