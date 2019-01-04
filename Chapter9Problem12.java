import java.util.Scanner;

public class Chapter9Problem12
{
	public static void main (String[] args)
	{
		// Created a String variable to test the wordCount method on. 
		String testWordCount = "Baba is the best!";

		// Created a char array to test the arrayToString method on. 
		char[] testCharArray = {'B', 'A', 'B', 'A'};

		// Created a String variable to test the mostFrequent method on.
		String testMostFrequent = "tie iet";

		// String variables to test replaceSubstring
		String string1 = "the dog jumped over the fence";

		String string2 = "the";

		String string3 = "that";

		System.out.println(MiscellaneousStringOperations.wordCount(testWordCount));

		System.out.println(MiscellaneousStringOperations.arrayToString(testCharArray));

		System.out.println(MiscellaneousStringOperations.mostFrequent(testMostFrequent));

		System.out.println(MiscellaneousStringOperations.replaceSubstring(string1, string2, string3));
	}
}