package hospital;

public class Patient implements Bleedable {

	static final int DEFAULT_HEALTH = 10;
	static final int DEFAULT_BLOODS = 42;
	private int health = DEFAULT_HEALTH;
	private int bloods = DEFAULT_BLOODS;

	public int getBloods() {
		return bloods;
	}

	public void removeBlood(int amount) {
		bloods -= amount;
	}

	public int getHealth() {
		return health;
	}

	public void giveHealth(int healthGiven) {
		health += healthGiven;
	}

}
