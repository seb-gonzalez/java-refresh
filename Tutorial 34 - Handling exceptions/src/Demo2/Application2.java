package Demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application2 {

	public static void main(String[] args) {
		
		String fileName = "test.txt";
		File file = new File(fileName);
		
		try {
			
			
			
			FileReader fr = new FileReader(file);
			
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found: " + file.toString());
			
		}
	
		
		
	}
	
}
