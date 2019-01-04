import java.util.Scanner;

public class Chapter9Problem7
{
	public static void main (String[] args)
	{
		// Created a String variable called date to hold the date the user will be asked to input.
		String date;

		/*
			Created a String variable called name to hold the payee's name of the check. 
			Once again, the user will be asked to input a value for this.
		*/
		String name;

		/*
			Created a double variable called doubleAmount to hold the amount of the check as a numerical double. 
			Once again, the user will be asked to input a value for this. 
		*/

		double doubleAmount;

		/*
			Created a String variable called stringAmount to hold the String amount of the check as a String.
			Once again, the user will be asked to input a value for this.
		*/

		String stringAmount;

		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Called the displayMenu method created below.
		displayMenu();

		// Get the date.
		System.out.println("User, please enter the date for the check: ");

		// Set the date.
		date = keyboard.nextLine();

		//Get the name.
		System.out.println("User, please enter the name for the check: ");

		// Set the name.
		name = keyboard.nextLine();

		// Get the doubleAmount.
		System.out.println("User, please enter the amount of money for the check (numerical form): ");

		// Set the doubleAmount.
		doubleAmount = keyboard.nextDouble();

		// Consume the remaining newline character...
		keyboard.nextLine();

		// Get the stringAmount.
		System.out.println("User, please enter the amount of money for the check (String form): ");

		// Set the stringAmount.
		stringAmount = keyboard.nextLine();

		// Call the displayCheck method to conclude the program.
		displayCheck(date, doubleAmount, name, stringAmount);
	}

	public static void displayMenu()
	{
		System.out.println("User, this program serves as a Check Writer.");
		System.out.println("You will be asked to input a date, name, money amount, and the words to be written on the check (again for the money)");
		System.out.println("Once this is done, your check will be printed for you!");
	}

	public static void displayCheck(String dateGiven, double doubleAmountGiven, String nameGiven, String stringAmountGiven)
	{
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\tDate: " + dateGiven);
		System.out.println("\t\t\t\t\t\t      $" + doubleAmountGiven);
		System.out.println("Pay to the Order of: " + nameGiven);
		System.out.println(stringAmountGiven);
		System.out.println("--------------------------------------------------------------------------");

	}
}