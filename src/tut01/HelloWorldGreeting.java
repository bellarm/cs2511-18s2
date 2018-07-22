package tut01;

public class HelloWorldGreeting {
	
	private String greeting;

	public void setGreeting(String aGreeting) {
		greeting = aGreeting;
	}
	
	public static void main(String[] args) {
		HelloWorldGreeting hello1 = new HelloWorldGreeting();
		hello1.setGreeting("COMP2511 is cool");
		System.out.println(hello1.greeting);
	
		HelloWorldGreeting hello2 = new HelloWorldGreeting();
		hello2.setGreeting("hello2");
		System.out.println(hello2.greeting);
	}
	
}
