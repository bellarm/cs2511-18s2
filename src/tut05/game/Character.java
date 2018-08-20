package tut05.game;

public abstract class Character {
	private WeaponBehavior behavior;

	public abstract void fight();
	
	public void setWeapon(WeaponBehavior w) {
		behavior = w;
	}
	
	public WeaponBehavior getWeapon() {
		return behavior;
	}

}
