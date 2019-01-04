public class PigLatin
{
	public static String pigLatinConverter(String[] stringArrayGiven)
	{
		// Created a String variable correctString to hold the correct output that will be returned at the end of the program.
		String correctString = "";

		// For loop increments the index of the array.
		for(int i = 0; i < stringArrayGiven.length; i++)
		{

			// Created a String variable currentArrayIndex to hold the String at the index number of the array that is incrementing.
			String currentArrayIndex = stringArrayGiven[i];

			// For loop runs the Pig Latin conversion JUST ONCE per word!
			for(int j = 0; j < 1; j++)
			{

				// Created an int variable currentWord which holds the number of letters in the word. 
				int currentWord = currentArrayIndex.length();

				// If the number of letters in the word equals 1...
				if(currentWord == 1)
				{
					// Set this value to correctString.
					correctString = correctString + currentArrayIndex.charAt(0) + "AY ";
				}

				// If the number of letters in the word is more than 1...
				else if(currentWord != 1)
				{
					// Get the first letter of the word.
					String str1 = currentArrayIndex.substring(0, 1);

					// Get the rest of the word.
					String str2 = currentArrayIndex.substring(1, currentArrayIndex.length());

					// Concat the rest of the word with the first letter.
					str2 = str2.concat(str1);

					// Add AY and a space.
					str2 = str2.concat("AY ");

					// Set this value to correctString.
					correctString = correctString.concat(str2);
				}
			}
		}

		// Return the correctString.
		return correctString;
	}
}