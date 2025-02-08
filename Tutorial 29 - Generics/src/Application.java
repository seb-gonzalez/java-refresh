import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

public class Application {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("banana");
		list.add("apple");
		
		String fruit = (String) list.get(1); // you need to downcast the object
		System.out.println(fruit);
		
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(2);
		System.out.println(animal);
		
		// there can be more than one type argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		ArrayList<Animal> someList = new ArrayList<>();
		
	}
}
