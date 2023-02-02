package Files;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class ReadFile {

	public static void main(String[] args) throws IOException {

		// http://textfiles.com/100/captmidn.txt

		File file = new File("C:\\Users\\Shashank.Peta\\Desktop\\Practise_file_handling.txt");
		Scanner scan = new Scanner(file);

		String fileContent = "THIS IS A NEW FILE MADE BY US";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter("C:\\Users\\Shashank.Peta\\Desktop\\New_file_handling.txt");
		writer.write(fileContent);
		writer.close();

	}

}