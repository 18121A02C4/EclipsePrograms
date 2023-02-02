package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Writting_into_a_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file=new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\B.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the content to be written in file B");
		String s=sc.nextLine();
		try {
			FileWriter wr=new FileWriter("C:\\\\\\Users\\\\Shashank.Peta\\\\Desktop\\\\Filehandling\\\\B.txt");
			wr.write(s);
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file =new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\B.txt");
		File opfile=new File("C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\C.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(opfile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
sc.close();
	}

}
