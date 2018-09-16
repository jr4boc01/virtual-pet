package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet myPet = new VirtualPet(0, 10, 10);

		// Display initial pet status
		myPet.displayStatus();

		Scanner input = new Scanner(System.in);
		boolean gameOn = true;

		do {
			int userAction = input.nextInt();
			input.nextLine();
			if (userAction > 4) {
				// Test for valid user input
				System.out.println("Invalid entry, please try again...");
				System.out.println();
				myPet.displayStatus();
			} else if (userAction == 4) {
				// See if user wants to exit game
				gameOn = false;
				System.out.println("Thanks for playing!!!");
			} else if (userAction == 1) {
				// User wants to feed the Chia
				myPet.feedPet();
				myPet.tick();
				System.out.println("Charlie says \"Yum! Thanks for the chow!\"");
				myPet.displayStatus();
			} else if (userAction == 2) {
				// User wants to give Chia water
				myPet.hydratePet();
				myPet.tick();
				System.out.println("Charlie says \"Burp! Thanks for the drink!\"");
				myPet.displayStatus();
			} else if (userAction == 3) {
				// User wants to pet Chia
				myPet.petPet();
				myPet.tick();
				System.out.println("Charlie says \"Ahhhh! I'm happy now!\"");
				myPet.displayStatus();
			} else {
				// exception code
				System.out.println("Program error msg 1");
				gameOn = false;
			}
			if (myPet.hydrationLevel < 3) {
				// Test if Charlie has died out of neglect - dehydration
				System.out.println("Game Over - Charlie the Chia has died of dehydration!");
				gameOn = false;
			} else if (myPet.hungerLevel > 8) {
				// Test if Charlie has died out of neglect - starvation
				System.out.println("Game Over - Charlie the Chia has died of starvation!");
				gameOn = false;
			}
		} while (gameOn = true);

		input.close();
	}

}
