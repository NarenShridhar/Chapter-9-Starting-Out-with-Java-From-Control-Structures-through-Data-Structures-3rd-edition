import java.util.Scanner;

public class Chapter9Problem3
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
			System.out.println("User, enter a String to have its first letter capitalized.");

			// Set the String from the user. 
			userString = keyboard.nextLine();

			// Call the sentenceCapitalizer method in the SentenceCapitalizer class to return the string with the first letter capitalized. 
			System.out.print("The same String with the first letter capitalized is: " + SentenceCapitalizer.sentenceCapitalizer(userString));

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
		System.out.println("This program will ask you to enter a String, and will return the same String but with the first word capitalized.");
		System.out.println("Here we go!");
	}
}