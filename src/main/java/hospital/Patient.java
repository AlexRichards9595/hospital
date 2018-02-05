package hospital;

public class Patient implements Bleedable {
	
	private int bloods = 42;

	public int getBloods() {
		return bloods;
	}

	public void removeBlood(int amount) {
		bloods -= amount;
	}

}
