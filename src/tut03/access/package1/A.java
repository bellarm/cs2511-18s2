package tut03.access.package1;

/*
 * @author Aarthi
 * @author Bella
 * 
 * A class defining variables with different access modifiers
 */
public class A {
	public int varPub = 20; 	// public access
	int var = 10;   			// default access 
	protected int varPro = 30; 	// protected access
	private int varPriv = 40;	// private access
	
	public void methodA() {
		// Within same class, have access to all variables (default, private,public,protecte)
		System.out.println("var: " + var);
		System.out.println("varPub: "  + varPub);
		System.out.println("varPro: "  + varPro);
		System.out.println("varPriv: " + varPriv);
	}

}
