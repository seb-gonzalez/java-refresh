
class Person {
	//1. Data
	//2. subroutines - methods
	
	String name;
	int age;
	
	
	
}


public class Application {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "sebastian";
		person1.age = 40;
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 34;
		
		System.out.println(person1);
	}
}
