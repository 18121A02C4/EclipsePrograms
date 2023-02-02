package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CREATINGNEWFILE 
{
	public static void main(String[] args) 
	{
		File file =new File("hello.txt");
//		File file=new File("robo.txt");
		try 
		{
			if(file.createNewFile()) 
			{
				System.out.println("file created "+file.getName());
			}
			else
			{
				System.out.println("file already exists"+file.getCanonicalPath());
				System.out.println("file already exists"+file.getAbsolutePath());

			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		try {
			FileWriter wr=new FileWriter("C:\\\\Users\\\\Shashank.Peta\\\\Desktop\\\\FileError\\\\solution.txt");
			wr.write("hey there");
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File fil=new File("C:\\\\\\\\Users\\\\\\\\Shashank.Peta\\\\\\\\Desktop\\\\\\\\FileError\\\\\\\\solution.txt");
	
		try {
			Scanner h = new Scanner(fil);
			while(h.hasNextLine()) {
				System.out.println(h.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
