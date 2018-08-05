package tut03.access.package1;

/*
 * @author Aarthi
 * A class defining variables with different access modifiers
 */
public class B extends A {
	
	public void methodB() {
		// Within the sub-class, have access to variables with default, public and protected scope
		System.out.println("var: " + var);
		System.out.println("varPub: "  + varPub);
		System.out.println("varPro: "  + varPro);
//		The line below does not compile because 
//		sub-classes do not have access to private variables in super class
//		System.out.println("varPriv: " + varPriv);
	}

}
