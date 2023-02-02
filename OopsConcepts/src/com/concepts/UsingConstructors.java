package com.concepts;

public class UsingConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println(s1);
//		s1.rno=99;
//		s1.name="rishi";
//		s1.marks=99.0f;
		System.out.println(s1);
		System.out.println(s1.name);
		Student s2=new Student(24,"dheeraj",92.25f);
		System.out.println(s2.name);
		System.out.println(s2.rno);
		System.out.println(s2.marks);
		s2.changeName("tharun");
		System.out.println("observe difference between names changed ");
		System.out.println(s2.name);
		System.out.println(s2.rno);
		System.out.println(s2.marks);
		Student h=new Student("heythere",89);
		System.out.println(h.name);




	}

}
class Student{
	int rno;
	String name;
    float marks;
    Student(){
    	rno=99;
		name="rishi";
		marks=99.0f;
    }
//    Student(){
//    	
//    }
//    Student(int rno,String name,float marks){
//    	rno=rno;
//    	name=name;//no effect of using like this no bond formation between args passed and object s2
//    	marks=marks;// if we try printing s2.name it is giving null only.
    // but we can use like this 
//    this.rno=rno;
//    this.name=name;//if we use like this bond forms.
//    this.marks=marks;
//    }
    Student(int rlno,String naam,float maarks){
    	rno=rlno;
    	name=naam;//here eventhough we are not using this.rno=rlno bond is forming between args passed and the object s2
    	marks=maarks;// but it is better to use this. keyword
    }
//    void changeName(String name) {
//    	
////    	name=name;//but if it is like this there is ambiguity between args passed and instance variables for the right side of name since no value changes.
//    		this.name=name;//we can use like this bond forms between args and object.
//    }
    void changeName(String naam) {
    	name =naam;//better to use this keyword
    }
    Student(String s,int n){
    	name=s;
    	rno=n;
    }
}