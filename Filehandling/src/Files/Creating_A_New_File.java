package Files;

import java.io.File;
import java.io.IOException;

public class Creating_A_New_File 
{
	public static void main(String[] args) 
	{
		File file =new File("C:\\innova.txt");
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
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
