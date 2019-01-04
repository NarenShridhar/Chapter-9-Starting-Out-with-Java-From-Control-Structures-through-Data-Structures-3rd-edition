public class SentenceCapitalizer
{
	// Created a static String method sentenceCapitalizer which returns the same String input by the user, except with the first letter capitalized.
	public static String sentenceCapitalizer(String stringObjectGiven)
	{
		// Created a char variable stringFirst to hold the first letter of the stringObjectGiven.
		char stringFirst;

		// Created a String variable stringAllButFirst to hold the String of StringObjectGiven except the first letter. 
		String stringAllButFirst;

		// Set the stringFirst variable to the upperCase of the first letter in the stringObjectGiven. 
		stringFirst = Character.toUpperCase(stringObjectGiven.charAt(0));

		// Set stringAllBuTFirst to the subString of stringObjectGiven starting from the second letter.
		stringAllButFirst = stringObjectGiven.substring(1);

		// Return the correct string with the capital first letter. 
		return stringFirst + stringAllButFirst;
	}
}