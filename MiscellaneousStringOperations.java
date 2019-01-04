public class MiscellaneousStringOperations
{
	// The wordCount method returns the number of words in the stringObjectGiven argument.
	public static int wordCount(String stringObjectGiven)
	{
		// Created an int variable called count initialized to 1, because the first letter of the string does not have a space in front.
		int count = 1;

		// Trimmed the stringObjectGiven so that leading or last spaces do not trigger the isSpaceChar count.
		stringObjectGiven = stringObjectGiven.trim();

		// For loop increments the index.
		for(int i = 0; i < stringObjectGiven.length() - 1; i++)
		{
			// If the current character is a space character...
			if(Character.isSpaceChar(stringObjectGiven.charAt(i)))
			{
				// then increment the count.
				count++;
			}
		}

		// Return the count.
		return count;
	}

	// The arrayToString method accepts a char array as an argument and converts it to a String object. 
	public static String arrayToString(char[] charArrayGiven)
	{
		// Created a String variable called endingObject to hold the charArray as a String.
		String endingObject;

		// Set endingObject equal to the valueOf charArrayGiven. 
		endingObject = String.valueOf(charArrayGiven);

		// Returned the endingObject. 
		return endingObject;
	}

	// The mostFrequeunt method returns the most frequent character in a String object. 
	public static char mostFrequent(String stringObjectGiven)
	{
		// char variable to hold the most frequent character.
		char mostOccurence = ' ';

		// int variable to hold the times the most occuring character appears.
		int most = 0;

		// For loop increments index.
		for(int i = 0; i < stringObjectGiven.length(); i++)
		{
			// count variable initialized to 0.
			int count = 0;

			// character variable equals the current value of stringObjectGiven.
			char character = stringObjectGiven.charAt(i);

			// For loop increments the index.
			for(int j = 0; j < stringObjectGiven.length(); j++)
			{
				// If the character at (i) equals the character at (j), it's been repeated...
				if(character == stringObjectGiven.charAt(j))
				{
					// So increase the count by 1. 
					count = count + 1;
				}
			}

			// If the count is greater than or equal to the most...
			if(count >= most)
			{
				// Set it to most.
				most = count;

				// Make the most occuring character, character.
				mostOccurence = character;
			}
		}

		// Return the most occuring character. 
		return mostOccurence;
	}

	// The replaceSubsstring method replaces the substring string2, w/ the substring string 3, which is part of the new string1 String. 
	public static String replaceSubstring(String string1, String string2, String string3)
	{
		// Use the replaceAll method which is part of java.lang to replace substring string2 w/ substring string2, in string1. 
		return string1.replaceAll(string2, string3);
	}
}