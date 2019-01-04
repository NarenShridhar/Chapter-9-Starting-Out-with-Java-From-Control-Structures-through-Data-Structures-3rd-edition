public class WordSeparator
{
	// Created a String method wordSeperator that accepts a String object and returns the correct version of the String.
	public static String wordSeparator(String stringObjectGiven)
	{
		// Created a String variable correctString to hold the correct version of the String.
		String correctString = "";

		// The first element of correctString is always the first letter of the stringObjectGiven capitalized.
		correctString += Character.toUpperCase(stringObjectGiven.charAt(0));

		// For loop increments the index.
		for(int i = 1; i < stringObjectGiven.length(); i++)
		{
			// If the character is lowecase...
			if(Character.isLowerCase(stringObjectGiven.charAt(i)))
			{
				// Add the character as is to the variable correctString.
				correctString = correctString + stringObjectGiven.charAt(i);
			}

			// Else if the character is uppercase...
			else if(Character.isUpperCase(stringObjectGiven.charAt(i)))
			{
				// Add a space and then add the lowercase of that same character.
				correctString = correctString + " " + Character.toLowerCase(stringObjectGiven.charAt(i));
			}

			// Else if it's a period...
			else if(stringObjectGiven.charAt(i) == '.')
			{
				// Add a period to the correctString.
				correctString = correctString + ".";
			}
		}

		// Return the correctString.
		return correctString;
	}
}