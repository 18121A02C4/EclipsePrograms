package com.Collectionsconcepts;
import java .util.*;
public class Prac_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new LinkedList<>();
		l.add(1);
		l.add(12);

		l.add(11);

		l.add(13);
		l.add(18);
		l.add(10);
		System.out.println(l);
		List l2=new LinkedList<>();
		List l1=new LinkedList<>();
		l1.add(45);
		l1.add(62);
		System.out.println(l1);
		l1.add(l);
		System.out.println(l1);
		l1.removeAll(l);
		System.out.println(l);
		l2.add(78);
		l2.add(98);
		System.out.println(l2);
		l2.addAll(l);
		System.out.println(l2);
		l2.removeAll(l);
		System.out.println(l2);
		l2.removeAll(l2);
		System.out.println(l2);

	}

}
