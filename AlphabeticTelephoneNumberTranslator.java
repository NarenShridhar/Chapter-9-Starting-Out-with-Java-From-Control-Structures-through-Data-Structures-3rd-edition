public class AlphabeticTelephoneNumberTranslator
{
	// Created a String method called numberTranslator, which accepts a String objectGiven and returns the correct version.
	public static String numberTranslator(String stringObjectGiven)
	{
		// For loop incremenets the index of the stringObjectGiven.
		for(int i = 0; i < stringObjectGiven.length(); i++)
		{
			// If the character is a letter (which it should not be)...
			if(Character.isLetter(stringObjectGiven.charAt(i)))
			{	
				// And if the letter is A, B, or C...
				if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'A' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'B' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'C')
				{
					// Replace the letter with the character '2'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '2');
				}

				// And if the letter is D, E, or F...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'D' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'E' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'F')
				{
					// Replace the letter with the character '3'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '3');		
				}

				// And if the letter is G, H, or I...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'G' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'H' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'I')
				{
					// Replace the letter with the character '4'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '4');		
				}

				// And if the letter is J, K, or L...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'J' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'K' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'L')
				{
					// Replace the letter with the character '5'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '5');		
				}

				// And if the letter is M, N, or O...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'M' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'N' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'O')
				{
					// Replace the letter with the character '6'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '6');		
				}

				// And if the letter is P, Q, R, or S...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'P' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'Q' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'R' || Character.toUpperCase(stringObjectGiven.charAt(i)) == 'S')
				{
					// Replace the letter with the character '7'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '7');		
				}

				// And if the letter is T, U, or V...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'T' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'U' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'V')
				{
					// Replace the letter with the character '8'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '8');		
				}

				// And if the letter is W, X, Y, or Z...
				else if(Character.toUpperCase(stringObjectGiven.charAt(i)) == 'W' ||  Character.toUpperCase(stringObjectGiven.charAt(i)) == 'X' 
					|| Character.toUpperCase(stringObjectGiven.charAt(i)) == 'Y' || Character.toUpperCase(stringObjectGiven.charAt(i)) == 'Z')
				{
					// Replace the letter with the character '7'.
					stringObjectGiven = stringObjectGiven.replace(stringObjectGiven.charAt(i), '9');		
				}
			}
		}

		// Return the fixed stringObjectGiven.
		return stringObjectGiven;
	}
}