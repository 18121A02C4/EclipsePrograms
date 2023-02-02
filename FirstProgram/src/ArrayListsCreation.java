import java.util.*;
public class ArrayListsCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(19);
		list.add(191);
		list.add(1);
		list.add(11);
		System.out.println(list);

		list.set(0, 99);
		list.remove(3);
		System.out.println(list);
		//to get an ele at index
		System.out.println(list.get(0));
		System.out.println(list.size());

		
		

	}

}
