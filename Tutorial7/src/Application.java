import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		
		
        double value = input.nextDouble();
        System.out.println("You entered the following value: " + value);
	}
}
