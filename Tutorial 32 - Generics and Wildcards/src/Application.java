import java.util.ArrayList;

class Machine {
	
	public String toString() {
		return "I am Machine";
	}
	
}

class Camera extends Machine {
	
	public String toString() {
		return "I am Camera";
	}
	
} 

public class Application {
	public static void main(String[] args) {
		
		ArrayList<Machine> list  = new ArrayList<Machine>();
		list.add( new Machine() );
		list.add( new Machine() );
		showList(list);
		
		
		ArrayList<Machine> list2 = new ArrayList<Machine>();
		list2.add( new Camera() );
		list2.add( new Camera() );
		showList(list2);
	}
	
	public static void showList(ArrayList<?> list) {
		for(Object value : list) {
			System.out.println(value);
		}
	}
}
