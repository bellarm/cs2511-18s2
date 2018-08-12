package tut03.access.package2;

import tut03.access.package1.A;

public class E extends A {

	public void methodE() {
		System.out.println("varPub: "  + varPub);
		// Protected is still visible even though in different package.
		System.out.println("varPro: " + varPro);
	}
}
