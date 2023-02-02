package Files;
import java.io.*;
public class ReadafileusingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f=new FileReader("C:\\Users\\Shashank.Peta\\Desktop\\Login Details.txt");//file stored in specific location
			FileReader f1=new FileReader("music.txt");//file stored in eclipse workspace
			int c=0;
			while((c=f.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
