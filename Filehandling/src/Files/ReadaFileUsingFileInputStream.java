package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadaFileUsingFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("C:\\Users\\Shashank.Peta\\Desktop\\Login Details.txt");
		try {
			FileInputStream fip=new FileInputStream(obj);
			int c=0;
			try {
				while((c=fip.read())!=-1) {
					System.out.print((char)c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(fip!=null) {
					try {
						fip.close();
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
		
	

	}

}
