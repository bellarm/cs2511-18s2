package tut01;

public class HelloWorld {
	private String greeting;
	private static String greeting2;
	
	public HelloWorld(String aGreeting) {
		greeting = aGreeting;
	}
	
	public HelloWorld() {
		this("default string");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello to the world");
		HelloWorld hWorld = new HelloWorld("hii");
		HelloWorld hWorld2 = new HelloWorld();
		System.out.println(hWorld.greeting);
		hWorld.greeting = "hi";
		System.out.println(hWorld.greeting);
		HelloWorld.greeting2 = "hi";
		//greeting = "hi";
		greeting2 = "hi";
	}
}
