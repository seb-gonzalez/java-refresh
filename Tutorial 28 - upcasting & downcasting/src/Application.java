
class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}

	public void snap() {
		System.out.println("Photo taken");
	}
}

public class Application {
	
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//UPCASTING 
		//Machine machine2 = new Camera(); //This is polymorphism
		Machine machine2 = camera1;
		machine2.start();
		
		//DOWNCASTING
		Machine machine3 = new Camera();
		// this does not work -> machine3.snap();
		Camera camera2 = (Camera) machine3;
		camera2.snap();
		
		Camera cam = (Camera) new Machine();
		cam.snap();
		
		
	}
}
