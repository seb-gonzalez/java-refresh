
class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello!");
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge() {
		return this.age;
	}
	
	String getName() {
		return this.name;
	}
}
public class Application {
	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Sebastian";
		person1.age = 40;
		
		int years = person1.calculateYearsToRetirement();
		System.out.println("Years to retirement: " + years);
	}
}
