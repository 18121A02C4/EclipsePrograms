package Files;

import java.io.File;
import java.io.IOException;


public class files {

	public static void main(String[] args) throws IOException
	{
		File obj1=new File("music.txt");
			boolean flag = false;
			try 
			{
				flag = obj1.createNewFile();
			}
			catch (IOException e) 
			{
				
			}
			if(flag) 
			{
				try {
					System.out.println("file created"+obj1.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else 
			{
				System.out.println("already exists"+obj1.getCanonicalPath());
			}
		}

	}

