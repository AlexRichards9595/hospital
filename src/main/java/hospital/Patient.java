package hospital;

public class Patient {
	
	private int bloods = 42;

	public int getBloods() {
		return bloods;
	}

	public void removeBlood(int amounts) {
		bloods -= 1;
	}

}
