package Files;
import java.io.*;//appending data done here using true in fileoutputstream
public class WritingintofileusingfileoutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f=new FileReader("music.txt");
			File file=new File("C:\\Users\\Shashank.Peta\\Desktop\\FileError\\solution.txt");

			FileOutputStream fos=new FileOutputStream(file,true);
			int i=0;
			try {
				while((i=f.read())!=-1) {
					fos.write((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(fos!=null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File fil=new File("C:\\Users\\Shashank.Peta\\Desktop\\FileError\\solution.txt");
		try {
			FileWriter fn=new FileWriter(fil,true);
			fn.write("jai jawan jai kisan");
			fn.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
