package com.Collectionsconcepts;
import java.util.*;
public class Dheeraj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Object> h=new LinkedHashMap<>();
		h.put("firstname","john");
		h.put("lastname","smith");
		h.put("age",25);
		LinkedHashMap<String,Object> h1=new LinkedHashMap<>();
		h1.put("streetaddress", "21 2nd street");
		h1.put("city", "newwyork");
		h1.put("state","NY");
		h1.put("postalcode",10021);
		h.put("address", h1);
		ArrayList a=new ArrayList<>();
		LinkedHashMap hp1=new LinkedHashMap<>();
		hp1.put("type","home");
		hp1.put("number","212-555-1234");
		LinkedHashMap hp2=new LinkedHashMap<>();
		Object type = null;//here we are giving type as Object datatype 
		hp2.put(type, "fax");//so before using type in hashmap we have to define and initialise it like//Object type=null;
		hp2.put("number","646 555 -1234");
		h.put("phonenumbers",a);
		a.add(hp1);
		a.add(hp2);
		System.out.println(h.getClass());
		ArrayList ans=(ArrayList)h.get("phonenumbers");
		HashMap hans=(HashMap)ans.get(1);
		String snas=(String) hans.get(type);
		
		System.out.println(h);
		System.out.println(snas);
		System.out.println(h1);
		System.out.println(hp1);
		System.out.println(hp2);

		System.out.println(snas.getClass());
		
		

	}

}
