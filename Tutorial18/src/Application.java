class Machine {
	
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor running");
		
	}
	
	
	public Machine(String name) {
		this(name, 0);
		System.out.println("Second constructor running");
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("Third constructor running");
	}
	
}


public class Application {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Sebastian");
		
		Machine machine3 = new Machine("Chalky", 7);
	}
}
