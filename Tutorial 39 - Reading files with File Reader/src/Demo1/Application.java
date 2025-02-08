package Demo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try( BufferedReader br = new BufferedReader( new FileReader(file) ) ) {
			
			String line;
			
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
			
	}

}
