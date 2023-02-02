package Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		File f=new File("C:\\Users\\Shashank.Peta\\Desktop\\our_file.txt");
		File f1=new File("C:\\Users\\Shashank.Peta\\Desktop\\your_file.txt");

		if(f.createNewFile()) {
			System.out.println("file created "+f.getName());
		}
		if(f1.createNewFile()) {
			System.out.println("file created "+f1.getName());
		}
		File f2=new File("C:\\Users\\Shashank.Peta\\Desktop\\Practise_file_handling.txt");
		Scanner rd=new Scanner(f2);
		String s1="Start";
		while(rd.hasNextLine()) {
			s1+=rd.nextLine()+"\n";
		}
		FileWriter writter=new FileWriter("C:\\Users\\Shashank.Peta\\Desktop\\our_file.txt");
		writter.write(s1);
		writter.close();
		File f3=new File("C:\\Users\\Shashank.Peta\\Desktop\\Login Details.txt");
		Scanner dr=new Scanner(f3);
		String s2="Stop ";
		while(dr.hasNextLine()) {
			s2+=dr.nextLine()+"\n";
		}
		FileWriter writter1=new FileWriter("C:\\Users\\Shashank.Peta\\Desktop\\your_file.txt");
		writter1.write(s2);
		writter1.close();
		
		

	}

}
