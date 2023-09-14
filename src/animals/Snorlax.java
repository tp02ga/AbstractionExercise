package animals;

public class Snorlax extends Pokemon {
	boolean awake = false;
	public static int maxHP = 524;
	
	public Snorlax () {
		// default constructor
	}
	
	public Snorlax (String in) {
		if (in.equals("awake")) {
			awake = true;
		}
	}
	
	public void animalSound() {
		if (!awake) {
			System.out.println("Snooore...snooooore......");
		} else {
			System.out.println("SNOOOOORLAAAAAAAX!!");
		}
	}
}
