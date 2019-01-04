public class WordCounter
{
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