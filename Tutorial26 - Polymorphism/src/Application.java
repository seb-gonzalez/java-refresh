


public class Application {
	public static void main(String[] args) {

			Plant plant1 = new Plant();
			Tree tree = new Tree();
			
			/* What polymorphism means is, if you have a child class ( of a parent class ),
			 * you could always use the child class
			 * */
			
			// Plant plant2 = plant1; // Two references to the same object, but I could also use a tree
			Plant plant2 = tree;
			plant2.grow(); 
			tree.shedLeaves();
			// plant2.shedLeaves(); // ERROR - It is the type of the variable what decides which
			// methods you can call
			
			doGrow(plant1); // polymorphism guarantess that wherever a parent class is expected
			// I can pass a child class of that parent
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
