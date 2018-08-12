package tut04.car;

public class Car {
	/* 
	 * engine is a component within this class.
	 * Calling any methods of engine is legal
	 */
	private Engine engine;
	
	public Car() {
		// initialise engine
		engine = new Engine();
	}
	
	/*
	 * start is a method, that takes in Key as an argument.
	 * calling any methods of key is hence legal
	 */
	public void start(Key key) {
		// Rule 2: You can call a method on an object passed in as a parameter
		boolean authorised = key.turns();
		Doors doors = new Doors();
		if (authorised) {
			// Rule 4: Engine is a component within this class.
			// You can call a method on the component of the object
			engine.start();
			
			// Rule 1: You can call a local method within the object
			updateDashboardDisplay();
	
			// Rule 3: doors is an object instantiated inside the method
			// hence, calling any of its methods is legal
			doors.lock();
		}
	}
	
	private void updateDashboardDisplay() {
		// TODO
	}
}
