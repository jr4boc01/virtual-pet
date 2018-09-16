package virtualpet;

public class VirtualPet {
	String petAction; // User provided action - feed, hydrate, pet
	int hungerLevel; // Level of hunger
	int hydrationLevel; // Level of hydration
	int happinessLevel; // Level of happiness

// Pet constructor 
//	
	public VirtualPet(int initialHungerLevel, int initialHydrationLevel, int initialHappinessLevel) {
		hungerLevel = initialHungerLevel;
		hydrationLevel = initialHydrationLevel;
		happinessLevel = initialHappinessLevel;
	}

// Pet methods
//	
	public void feedPet() {
		hungerLevel -= 2;

	}

	public void hydratePet() {
		hydrationLevel += 2;

	}

	public void petPet() {
		happinessLevel += 2;

	}

	public void displayStatus() {
		System.out.println();
		System.out.println("Charlie the Chia Pet has the following status: ");
		System.out.println(" Hunger level:    " + hungerLevel);
		System.out.println(" Hydration level: " + hydrationLevel);
		System.out.println(" Happiness level: " + happinessLevel);

		System.out.println(" ");
		System.out.println("What would you like to do for Charlie? ");
		System.out.println("1. Feed ");
		System.out.println("2. Give water ");
		System.out.println("3. Pet ");
		System.out.println("4. Exit game");
		System.out.println("> ");

	}

	public void tick() {
		hungerLevel += 1;
		hydrationLevel -= 1;
		happinessLevel -= 1;

	}

}
