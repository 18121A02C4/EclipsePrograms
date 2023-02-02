package Files;
import java.io.*;
public class OverallFilehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Shashank.Peta\\Desktop\\Filehandling\\joker.txt";
		try {
			FileOutputStream fos=new FileOutputStream(path,true);
			String content="i hate batman";
			byte[] b=content.getBytes();
			try {
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileWriter f=new FileWriter(path,true);
			String s="\n"+"if u hate batman i hate joker";
			f.write(s);
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
