import java.util.Scanner;
import java.io.*;

public class Chapter9Problem10
{
	public static void main (String[] args) throws IOException
	{
		// Created a Scanner object called keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		// Created a String variable called filename to hold the filename that the user enters.
		String filename;

		// Created an int variable count to hold the number of words.
		int count;

		// Called the display method created below.
		display();

		// Get the filename from the user.
		System.out.println("User, please enter the filename");

		// Set the filename.
		filename = keyboard.nextLine();

		// Open the file by creating a File object called file.
		File file = new File(filename);

		// Created another Scanner object inputFile with the File object file.
		Scanner inputFile = new Scanner(file);

		// Created an int variable lineNumber and initialized it to 1 since the first line is always line 1.
		int lineNumber = 1;

		// Created an int variable totalWords to holds the total words in the file per the program instructions. 
		int totalWords = 0;

		// While loop reads the file and calls the wordCounter method to display the words in each line.
		while(inputFile.hasNext())
		{
			String line = inputFile.nextLine();
			System.out.println("The number of words in line " + lineNumber + " is " + wordCounter(line));
			totalWords += wordCounter(line);
			lineNumber++;
		}

		// Print the total words in the file. 
		System.out.println("The total amount of words in the file is: " + totalWords);
	}

	// Created a display method to outline the program's objectives.
	public static void display()
	{
		System.out.println("User, this program works in the following way.");
		System.out.println("You will be asked for to enter the name of a file, and then the program" + 
			" will display the number of words the file contains.");
	}

	// Created a static int method called wordCounter which accepts a String object and returns the number of words in the object.
	public static int wordCounter(String stringObjectGiven)
	{
		// Created an int variable count to hold the number of words in an object.
		int count;

		// Initialized the count to 1, because the first number does not have a space character in front of it. 
		count = 1;

		// For loop incremenets the index of the String object.
		for(int i = 0; i < stringObjectGiven.length() - 1; i++)
		{
			// If the current character is a space character...
			if(Character.isSpaceChar(stringObjectGiven.charAt(i)))
			{
				// Increment the counter.
				count++;
			}
		}

		// Return the count. 
		return count;
	}

}