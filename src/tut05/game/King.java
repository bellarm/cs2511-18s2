package tut05.game;

public class King extends Character {
	public King() {
		super();
		setWeapon(new SwordBehaviour());
	}

	@Override
	public void fight() {
		getWeapon().useWeapon();
		// Do other stuffs.
	}
}
