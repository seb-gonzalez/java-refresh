import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		System.out.println(numbers.get(0));
		
		for(int i=0; i < numbers.size(); i++) System.out.println(numbers.get(i));
		
		
		for(Integer ele : numbers) System.out.println(ele);
		
		numbers.remove(numbers.size() - 1);
		for(Integer ele : numbers) System.out.println(ele);
		
		List<String> values = new ArrayList<String>();
		
	}
	
}
