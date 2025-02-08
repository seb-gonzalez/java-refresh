
public class Application {
	public static void main(String[] args) {
		
		int[] values;
		values = new int[3]; //Point this reference to this
		
		System.out.println(values[0]);
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i=0; i<values.length; i++) System.out.println(values[i]);
		
		int[] numbers = {4, 5, 6};
		for(int j=0; j<numbers.length; j++) System.out.println(numbers[j]);
	}
}
