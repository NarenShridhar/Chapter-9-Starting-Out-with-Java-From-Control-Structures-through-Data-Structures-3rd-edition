import java.util.Scanner;

public class Chapter9Problem2
{
	public static void main (String[] args)
	{
		// Created a String variable called userString to hold the input from the user. 
		String userString;

		// Created a char variable repeat to allow the user to run the program as many times as they wish. 
		char repeat = 'Y';

		// Created a Scanner object called keyboard to take in the user's input. 
		Scanner keyboard = new Scanner(System.in);

		// Call the display method to inform the user of the program's objectives. 
		display();

		// While loop allows the user to enter new Strings and test the program as many times as they wish.
		while(Character.toUpperCase(repeat) == 'Y')
		{
			// Get the String from the user.
			System.out.println("User, enter a String to find out how many words are in it.");

			// Set the String from the user. 
			userString = keyboard.nextLine();

			// Call the wordCounter method from the WordCounter class to count the words in the String entered by the user.
			System.out.print("The amount of words in the String are: " + WordCounter.wordCounter(userString));

			// Print an extra line for spacing.
			System.out.println();

			System.out.println("Do you want to run this program again? Type 'Y or 'N': ");
			repeat = keyboard.nextLine().charAt(0);
		}
	}

	// display method informs the user of the program's operations.
	public static void display()
	{
		System.out.println("Hello User!");
		System.out.println("This program will ask you to enter a String, and will return the number of words in the String.");
		System.out.println("Here we go!");
	}
}