import java.util.Scanner;
public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter team code:");
		String teamcode=sc.next();
		
		System.out.println("enter emp first name");
		String firstname=sc.next();
		
		switch(teamcode) {
		case "qa" :
			switch(firstname) {
			case "shashank":
				System.out.println("u are looking for peta shashank 12th floor");
				break;
			case "sai":
				System.out.println("u are looking for sai krishna 12th floor");
				break;
			default:
				System.out.println("enter valid first name");
			}
			break;
		case "dev":
			switch(firstname) {
			case "sai":
				System.out.println("u are looking for sai baba 13 th floor");
				break;
			case "chandu":
				System.out.println("u are looking for chandradeep 12 th floor");
				break;
			default:
				System.out.println("enter valid first name");
			}
			break;
				
				
			
		default:
			
			System.out.println("enter valid team code");
			
	
		sc.close();	
		}

	}

}
