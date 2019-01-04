import java.util.Scanner;

public class Chapter9Problem15
{
	public static void main (String[] args)
	{
		// Created a Scanner object keyboard to take in the user's input.
		Scanner keyboard = new Scanner(System.in);

		String stringTest = "PLEASE WORK";

		String[] arrayTest = stringTest.split(" ");

		System.out.println(stringTest);

		System.out.println("The pig latin for this is: " + PigLatin.pigLatinConverter(arrayTest));
	}
}