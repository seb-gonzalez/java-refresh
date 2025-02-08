
public class Car extends Machine {

	// Car inherits from machine
	// Car has now all the methods found in machine
	
	// Below we are also overriding methods
	// overriden the method in the parent class
	
	/*public void start() {
		System.out.println("car started");
	}
	
	public void stop() {
		System.out.println("car stopped");
	}*/
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	
	public void showInfo() {
		System.out.println("Can we see the private variable in the superclass? " + message);
	}
}
