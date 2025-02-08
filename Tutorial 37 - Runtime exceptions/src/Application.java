
public class Application {

	public static void main(String[] args) {
		
		/* There are two kind of exceptions. Runtime and checked exceptions
		 * 
		 * Thread.sleep(11);  throws a checked exception for example, so you have to
		 * handle it  - InterruptedException
		 * */
		
		/* Runtime exceptions are also called as unchecked exceptions
		 * */
		
		int value = 7;
		value = value / 0;   // This is a runtime/unchecked exception
		
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Application.main(Application.java:16)
	
	ArithmeticException is a child of runtime exception, which once again, it is an unchecked exception
	
	
	Runtime exceptions do not force us to handle it. No need of put a try catch in there.
		 * */
		
	}
	
}
