
class Baby {
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}
	
	void sayHello() {
		System.out.println("Hello there!!!");
	}
}

public class Application {
	public static void main(String[] args) {

		Baby baby1 = new Baby();
		baby1.name = "Duru";
		baby1.age = 1;
		baby1.speak();
		baby1.sayHello();
	}
}
