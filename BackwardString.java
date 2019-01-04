public class BackwardString
{
	// Created the static void method backwardString which accepts a String object as an argument and returns the String backwards.
	public static void backwardString(String stringObjectGiven)
	{
		// Initialize i as the length of the String object, then decrement i. 
		for(int i = stringObjectGiven.length() - 1; i >= 0; i--)
		{
			// Print the backwards String.
			System.out.print(stringObjectGiven.charAt(i));
		}
	}
}