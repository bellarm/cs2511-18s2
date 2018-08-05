package tut02;

public class StaticVsNonStatic {
	// Normal member variable.
	private String greeting;
	
	// Static variable, shared between all 
	// instances of the class.
	private static String greeting2;
	
	/**
	 * Constructor with 1 argument.
	 * 
	 * @param aGreeting
	 */
	public StaticVsNonStatic(String aGreeting) {
		greeting = aGreeting;
	}
	
	/**
	 * Constructor with 0 argument.
	 */
	public StaticVsNonStatic() {
		// Call the above constructor with 1 argument.
		this("default string");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello to the world");
		
		// Creating an object with "hii".
		StaticVsNonStatic hWorld = new StaticVsNonStatic("hii");
		System.out.println(hWorld.greeting);
		
		// Creating object with "default string".
		StaticVsNonStatic hWorld2 = new StaticVsNonStatic();
		System.out.println(hWorld2.greeting);
		
		// Change the string inside hWorld.
		hWorld.greeting = "hi";
		System.out.println(hWorld.greeting);
		
		// Accessing static variable.
		System.out.println(StaticVsNonStatic.greeting2);
		StaticVsNonStatic.greeting2 = "hi";
		System.out.println(StaticVsNonStatic.greeting2);
		
		// This doesn't work:
		//greeting = "hi";
		
		// This works:
		greeting2 = "hi";
	}
}
