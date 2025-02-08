
class Thing {
	
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	
	public void showName() {
		System.out.println(this.name);
	}
	
	public static void showInfo() {
		System.out.println("Hello");
	}
	
}

public class Application {
	public static void main(String[] args) {
		
		System.out.println("Tutorial 19 - static variables");
		// Static member variables, also known as class variables, does not belong to the object but the class
		// There is only one copy cause there is only one class
		
		Thing.description = "I am a thing";
		Thing.showInfo();
		System.out.println(Thing.LUCKY_NUMBER);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println(thing1.LUCKY_NUMBER);
		thing1.showName();
		thing2.showName();
		
		
		
	}
}
