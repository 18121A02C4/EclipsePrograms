package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Checking_copyFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			FileWriter writter=new FileWriter("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\D.txt");
			writter.write("\n"+"writting into  file which has already something in it");
			writter.close();
			System.out.println("successfully written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file =new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\D.txt");
		File opfile=new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\E.txt");
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
		System.out.println("enter the content");
		String s=sc.nextLine();
		byte[] b=s.getBytes();
		try {
			fos.write(b);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
