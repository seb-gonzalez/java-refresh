
public class Person implements Info{
	
	private String name;
	
	public void greet() {
		System.out.println("Hello");
	}
	
	public Person(String name) {

		this.name = name;
	}
	
	
	public void showInfo() {
		System.out.println("Here is the name " + name
				);
	}
}
