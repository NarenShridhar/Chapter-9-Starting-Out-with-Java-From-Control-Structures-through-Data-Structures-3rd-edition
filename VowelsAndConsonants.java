public class VowelsAndConsonants
{
	// Created a static String variable called stringObject to hold the stringObjectGiven from the user. 
	private static String stringObject;

	// Constructor, accepts a String object as the argument called stringObjectGiven
	public VowelsAndConsonants(String stringObjectGiven)
	{
		// Sets the stringObject equal to the stringObjectGiven.
		stringObject = stringObjectGiven;
	}

	// numberOfVowels method returns the number of vowels in a String.
	public static int numberOfVowels()
	{
		// Created an int variable called vowelCount initialized to 0 to hold the number of vowels in the String.
		int vowelCount = 0;

		// For loop incremenets the index through the length of the String object.
		for(int i = 0; i < stringObject.length(); i++)
		{
			// If the Character is a letter...
			if(Character.isLetter(stringObject.charAt(i)))
			{
				// and If the Character is a vowel...
				if(stringObject.charAt(i) == 'A' || stringObject.charAt(i) == 'a' || stringObject.charAt(i) == 'E' || stringObject.charAt(i) == 'e'
					|| stringObject.charAt(i) == 'I' || stringObject.charAt(i) == 'i' || stringObject.charAt(i) == 'O' || stringObject.charAt(i) == 'o'
				|| stringObject.charAt(i) == 'U' || stringObject.charAt(i) == 'u')
				{
					// Increment the vowelCount.
					vowelCount++;
				}
			}
		}

		// Return the vowelCount.
		return vowelCount;
	}

	// numberOfConsonants method returns the number of Consonants in a String. 
	public static int numberOfConsonants()
	{
		// Created an int variable called consonantCount initialized to 0 to hold the number of consonants in the String.
		int consonantCount = 0;

		// For loop incremenets the index through the length of the String object.
		for(int i = 0; i < stringObject.length(); i++)
		{
			// If the Character is a letter...
			if(Character.isLetter(stringObject.charAt(i)))
			{
				// and If the Character is a consonant...
				if(stringObject.charAt(i) != 'A' && stringObject.charAt(i) != 'a' && stringObject.charAt(i) != 'E' && stringObject.charAt(i) != 'e'
					&& stringObject.charAt(i) != 'I' && stringObject.charAt(i) != 'i' && stringObject.charAt(i) != 'O' && stringObject.charAt(i) != 'o'
				&& stringObject.charAt(i) != 'U' && stringObject.charAt(i) != 'u')
				{
					// Increment the consonantCount.
					consonantCount++;
				}
			}
		}

		// Return the consonantCount.
		return consonantCount;
	}
}