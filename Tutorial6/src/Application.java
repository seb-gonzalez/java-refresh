
public class Application {
	public static void main(String[] args) {
		
		int myInt = 15;
		
		if(myInt < 10) {
			System.out.println("Yes, it's true");
		}
		else if(myInt > 20) {
			System.out.println("No, it's false");
		}
		else {
			System.out.println("None of the above");
		}
		
		int loop = 0;
		
		while(loop <= 5) {
		    if(loop==5) break;
			System.out.println("looping: " + loop);
			loop ++;
		}
		
	}
}


