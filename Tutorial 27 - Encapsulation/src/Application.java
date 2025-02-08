/* Encapsulation - 
 * 
 * 
 * 
 * */


class Plant {
	
	private String name; // you can't access this variable from outside of the class. you need
	                     // getters and setters - public methods will be used outside
	
	public static final int ID  = 8;// final means variable cannot change. Also is a constant
	
	
	public String getData() {
		String data = "do something " + this.calculateGrowthForecast();
		
		return data;
		
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Application {
	public static void main(String[] args) {

	}
}
