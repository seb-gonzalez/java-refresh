
public class Application {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.Start();
		
		Person person1 = new Person("Sebastian");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		
		outputInfo(person1);
		outputInfo(mach1);

	}
	
	
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
