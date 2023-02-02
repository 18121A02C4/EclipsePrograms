package Files;
import java.io.*;
public class Appending_into_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
			FileWriter f=new FileWriter("C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\Desktop\\\\\\\\FileError\\\\\\\\solution.txt",true);
			f.write("appending 2nd time data into file");
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
