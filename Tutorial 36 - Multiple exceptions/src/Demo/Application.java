package Demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

public class Application {

	public static void main(String[] args) {
		
			
		Test test = new Test();
		
		
			
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
		
		try {
			test.input();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
