import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "C:\\Users\\Sebastian\\Desktop\\test.txt";
		
		File textFile = new File(fileName);
		Scanner in = new Scanner(textFile);
		
		while(in.hasNextLine()) {
			
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
		
	}
}
