package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\A.txt");
		File opfile=new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\ab.txt");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream(opfile);
		int i=0;
		try {
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(fis!=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(fos!=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//another way of writing but if i use both writings at a time only one is working.
		// because while using file writter at bottom it is taking or considering the path in filewritter() as a new file and then entering the data into it,so the data entered initially in A file is erased but viceversa is working properly like in Checking_copyFile.java class.
//		try {
//			FileWriter writter=new FileWriter("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\a.txt");
//			writter.write("\n"+"THE CONTENT IN (A) FILE IS COPIED INTO(ab) FILE");
//			writter.close();
//			System.out.println("successfully written");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	
}
