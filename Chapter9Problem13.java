import java.util.Scanner;

public class Chapter9Problem13
{
	public static void main (String[] args)
	{
		// Created a Scanner object keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a String variable userPhoneNumber to hold the phone number entered by the user. 
		String userPhoneNumber;

		// Called the display method created below. 
		display();

		// Get the userPhoneNumber.
		System.out.println("User, enter the phone number w/ letters to have converted to numbers (in the format shown in the menu");

		// Set the userPhoneNumber.
		userPhoneNumber = keyboard.nextLine();

		/*
		Now pass this number into the numberTranslator method in the AlphabeticTelephoneNumberTranslator class 
		to get the correct String, and print the result. 
		*/

		System.out.println("User, the number you entered with letters has now become: " 
			+ AlphabeticTelephoneNumberTranslator.numberTranslator(userPhoneNumber));

	}

	// Created a display method to display the objectives of this program. 
	public static void display()
	{
		System.out.println("User, this program will ask you to enter a 10 character phone number in the format XXX-XXX-XXXX");
		System.out.println("If you enter any letters, fear not, the program will conver them to their numerical counterpart");
		System.out.println("Enjoy!");
	}
}