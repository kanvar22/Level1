/* Your mission should you choose to accept it:
 *         Add a main method to the Popcorn class to cook a bag of Popcorn. Don't change the existing methods.
 */

class Microwave2 {
	private int cookTime;
	Popcorn2 thingToBeCooked;

	Microwave2() {
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcorn2 thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		this.cookTime = cookTimeInMinutes;
	}

	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime * 1 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}

public class Popcorn2 {

	private int kernels = 20;
	private String flavor;

	public static void main(String[] args) {
		Microwave2 micro = new Microwave2();
		Popcorn2 pop = new Popcorn2("butter");
		micro.putInMicrowave(pop);
		micro.setTime(60);
		micro.startMicrowave();

	}

	Popcorn2(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}

	public void applyHeat() {
		pause();

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
