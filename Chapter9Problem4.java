import java.util.Scanner;

public class Chapter9Problem4
{
	public static void main (String[] args)
	{
		// Created a string variable called userString to hold the String input by the user. 
		String userString;

		// Created a Scanner object called keyboard to take in the input from the user. 
		Scanner keyboard = new Scanner(System.in);

		// Created a string variable called userDecision to hold the user's decision for what menu option to select.
		char userDecision = 'z';

		// Get the String from the user.
		System.out.println("User, please enter a String: ");

		// Set the String from the user. 
		userString = keyboard.nextLine();

		// While loop serves to run the program as long as the user does not select the quit option, option e. 
		while(Character.toLowerCase(userDecision) != 'e')
		{
			// Create an object of the VowelsAndConsonants class using the String the user just gave.
			VowelsAndConsonants vacObject = new VowelsAndConsonants(userString);

			// Call the displayMenu method shown below. 
			displayMenu();

			// Get the user's decision on which menu selection they want.
			System.out.println("User, what is your decision? Select, 'a', 'b', 'c', 'd', or 'e': ");

			// Set the user's decision.
			userDecision = keyboard.nextLine().charAt(0);

			// If the user selects a...
			if(Character.toLowerCase(userDecision) == 'a')
			{
				// Print the number of vowels in the String.
				System.out.println("The number of vowels in the String are: " + vacObject.numberOfVowels());
			}

			// else if the user selects b...
			else if(Character.toLowerCase(userDecision) == 'b')
			{
				// Print the number of consonants in the String.
				System.out.println("The number of consonants in the String are: " + vacObject.numberOfConsonants());
			}

			// else if the user selects c...
			else if(Character.toLowerCase(userDecision) == 'c')
			{
				// Print the number of consonants + vowels in the String.
				System.out.println("The number of consonants + vowels in the String are: " + (vacObject.numberOfConsonants() 
					+ vacObject.numberOfVowels()));
			}

			// else if the user selects d...
			else if(Character.toLowerCase(userDecision) == 'd')
			{
				// Set another String
				System.out.println("User enter another String: ");
				userString = keyboard.nextLine();

			}
		}
	}

	// The displayMenu method displays the menu of selectable options for the user to enter. 
	public static void displayMenu()
	{
		System.out.println("a. count the number of vowels in a string");
		System.out.println("b. count the number of consonants in a string");
		System.out.println("c. count the number of consonants and vowels in a string");
		System.out.println("d. Enter another string");
		System.out.println("e. Exit the program");
	}
}