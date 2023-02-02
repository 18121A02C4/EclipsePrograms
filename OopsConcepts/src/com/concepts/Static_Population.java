package com.concepts;
public class Static_Population{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kunal=new Human(2,"kushwaha",90);
		Human prudhvi=new Human(2,"balu",76);
		System.out.println(kunal.population);
		System.out.println(prudhvi.population);
	}
}
class Human{
	int age;
	String name;
	int salary;
	static int population;
	Human(int a,String b,int p){
		this.age=a;
		this.name=b;
		this.salary=p;
		this.population+=1;//this works it better to use 
		//Human.population+=1;
	}
}
