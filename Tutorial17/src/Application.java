/*
 * I have encapsulated the data by hidding it away
 * */
class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setInfo(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
}

public class Application {
	public static void main(String[] args) {

		Frog frog1 = new Frog();
		frog1.setInfo("Bertie", 1);
		
		
		System.out.println(frog1.getName());
	}
}
