import java.util.Scanner;

public class Chapter9Problem9
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a String variable called userString to hold the string input from the user. 
		String userString;

		// Created a char variable called repeat to determine whether the user wants to repeat the program or not. 
		char repeat = 'Y';

		// While loop serves to allow the user to run the program as many times as they wish. 
		while(Character.toUpperCase(repeat) == 'Y')
		{
			// Get the userString.
			System.out.println("User, please enter a series of single digit numbers with nothing seperating them. ");

			// Set the userString;
			userString = keyboard.nextLine();

			int number = Integer.parseInt(userString);

			int[] intArray = new int[userString.length()];

			for(int i = 0; i < intArray.length; i++)
			{

				intArray[i] = Integer.parseInt(Integer.toString(number).substring((i), (i +1)));
			}

			System.out.println(intArray[0]);
			System.out.println(intArray[1]);
			System.out.println(intArray[2]);
			System.out.println(intArray[3]);



			// Created a String array called userArray and initialized it to the size of the userString's length. 
			//String[] userArray = new String[userString.length()];


			System.out.println(getSum(intArray));
			System.out.println(getHighest(intArray));
			System.out.println(getLowest(intArray));
		}
	}

	// Created a display method to display the objectives of this program.
	public static void display()
	{
		System.out.println("User, this program will ask you to enter a series of single digit numbers with nothing seperating them.");
		System.out.println("The program will then display the sum of all the single digit numbers in the string you provided. ");
		System.out.println("In addition, the program will display the highest and lowest digits in the string.");
	}

	// Created the double method getSum to return the sum of the digits entered into the array.
	public static double getSum(int[] arrayGiven)
	{
		// Created a double variable sum to hold the total sum outputted at the end of the program. Sum starts by being initialized to 0.0. 
		int sum = 0;

		// Enhanced for loop calculates the sum. 
		for(int element : arrayGiven)
		{
			sum += element;
		}

		return sum;
	}

	// Created the String method getHighest to return the highest element in the array given. 
	public static int getHighest(int[] arrayGiven)
	{
		// Created a String variable highest, to hold the highest element in the array.
		int highest = arrayGiven[0];

		for(int i = 0; i < arrayGiven.length; i++)
		{
			if(arrayGiven[i] - highest > 0)
			{
				highest = arrayGiven[i];
			}
		}

		return highest;
	}

	// Created the String method getLowest to return the lowest element in the array given. 
	public static int getLowest(int[] arrayGiven)
	{
		// Created a String variable lowest, to hold the lowest element in the array.
		int lowest = arrayGiven[0];

		for(int i = 0; i < arrayGiven.length; i++)
		{
			if(arrayGiven[i] - lowest < 0)
			{
				lowest = arrayGiven[i];
			}
		}

		return lowest;
	}
}