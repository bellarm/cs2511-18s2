package tut01;

public class HelloWorldGreeting {
	
	private String greeting;

	public void setGreeting(String aGreeting) {
		greeting = aGreeting;
	}
	
	public static void main(String[] args) {
		// Create an instance of this class.
		HelloWorldGreeting hello1 = new HelloWorldGreeting();
		// Change the greeting field.
		hello1.setGreeting("COMP2511 is cool");
		System.out.println(hello1.greeting);
	
		// Create another object.
		HelloWorldGreeting hello2 = new HelloWorldGreeting();
		hello2.setGreeting("hello2");
		System.out.println(hello2.greeting);

		// The previous object still has the old string.
		System.out.println(hello1.greeting);
		
		/* It's important to note that when you create a new object,
		 * a new chunk of memory will be allocated for it, and the field
		 * (ie. the variable `greeting`) is different for every instance
		 * of the class.
		 */
	}
	
}
