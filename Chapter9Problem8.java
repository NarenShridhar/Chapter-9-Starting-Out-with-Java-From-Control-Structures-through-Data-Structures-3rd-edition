import java.util.Scanner;

public class Chapter9Problem8
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a String variable called userInput to hold the user's input of String numbers.
		String userInput;

		// Created a double variable called sum to hold the total sum, and initialized it to start at 0. 
		double sum = 0.0;

		// Call the display method created below to outline the program's goals.
		display();

		// Get the userInput.
		System.out.println("User, enter numbers seperated by a comma ',': ");

		// Set the userInput.
		userInput = keyboard.nextLine();

		// Trim the String
		userInput = userInput.trim();

		// Get the tokens using "," as the delimeter.
		String[] tokens = userInput.split(",");

		// Calculate the sum using the parseDouble method as well as an enhanced for loop.
		for(String element : tokens)
		{
			sum += Double.parseDouble(element);
		}

		// Display the final sum.
		System.out.println("The sum of the numbers you entered into the String are: " + sum);

	}

	// Created a display method to outline the program's goals.
	public static void display()
	{
		System.out.println("User, this program will ask you to enter a String of number seperated by commas.");
		System.out.println("The program will then calculate the sum of those numbers.");
	}
}