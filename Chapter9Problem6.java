import java.util.Scanner;

public class Chapter9Problem6
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a String array called namesArray to hold the names given from the user. The user will determine the size of this array. 
		String[] namesArray;

		// Created a String array called phoneArray to hold the phone numbers given from the user. The user will determine the size of this array.
		String[] phoneArray;

		// Created an int variable userNumber to hold the number of elements the user wants the array's to have. 
		int userNumber;

		// Created a String variable userName to hold the name the user wants to search for. 
		String userName;

		// Created a boolean variable status to be the flag for this program.
		//boolean status = false;

		// Called the display method below.
		display();

		// Get the String array sizes from the user. 
		System.out.println("User, how many names/phone numbers do you want to have?");
		userNumber = keyboard.nextInt();

		// Set the namesArray size.
		namesArray = new String[userNumber]; 

		// Set the phoneArray array size.
		phoneArray = new String[userNumber]; 

		// For loop sets each namesArray element based on what the user inputs. 
		for(int i = 0; i < namesArray.length; i++)
		{
			// Ask the user to enter a String for each element of the array
			System.out.println("User, please enter a name " + (i + 1));

			if(i == 0)
			{
				// Make sure to print this next line, or else the program will not function.
				keyboard.nextLine();

				// Store each user input into each respective element field. 
				namesArray[i] = keyboard.nextLine();
			}

			else
			{
				// Store each user input into each respective element field. 
				namesArray[i] = keyboard.nextLine();
			}
		} 

		// Print an empty line for formatting.
		System.out.println();

		System.out.println("User, you entered: ");

		// Now show the user what they entered to make sure they are happy.
		for(int i = 0; i < namesArray.length; i++)
		{
			// Print the user's input
			System.out.print("Name " + (i + 1) + ": " + namesArray[i] + "\n");
		}

		// Print an empty line for formatting.
		System.out.println();

		// For loop sets each phoneArray element based on what the user inputs. 
		for(int i = 0; i < phoneArray.length; i++)
		{
			// Ask the user to enter a String for each element of the array
			System.out.println("User, please enter phone number " + (i + 1) + " which corresponds to " + namesArray[i]);

			if(i == 0)
			{
				// Make sure to print this next line, or else the program will not function.
				//keyboard.nextLine();

				// Store each user input into each respective element field. 
				phoneArray[i] = keyboard.nextLine();
			}

			else
			{
				// Store each user input into each respective element field. 
				phoneArray[i] = keyboard.nextLine();
			}
		} 

		// Print an empty line for formatting.
		System.out.println();

		System.out.println("User, you entered: ");

		// Now show the user what they entered to make sure they are happy.
		for(int i = 0; i < phoneArray.length; i++)
		{
			// Print the user's input
			System.out.print("Phone number " + (i + 1) + ": " + phoneArray[i] + "\n");
		}

		// Print an empty line for formatting.
		System.out.println();

		// Get the name the user wants to search for. 
		System.out.println("Now user, is there a name you want to search for? If so, enter it here: ");

		// Set the name the user wants to search for. 
		userName = keyboard.nextLine();

		// For loop increments the index to search for the given String within the namesArray
		for(int i = 0; i < namesArray.length; i++)
		{
			if(namesArray[i].indexOf(userName) >= 0)
			{
				System.out.println("The program found: " + "\n" + namesArray[i] + "\t" + phoneArray[i]);
				//found = true;
			}

			else if(namesArray[i].indexOf(userName) < 0)
			{
				System.out.println("The name " + userName + "was not found");
			}
		}
	}

	// Created a static void method called display to display the objectives of the program to the user. 
	public static void display()
	{
		System.out.println("User, in this program you will be asked to input values of an array size, as well as values to fill those arrays.");
		System.out.println("Ultimately, you will then be asked to search for a specific value, and if it is in the array, it will be displayed...");
		System.out.println("If it is not in the array, then the fact that it is not in the array will be displayed instead.");
	}
}
