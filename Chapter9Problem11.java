import java.util.Scanner;
import java.io.*;

public class Chapter9Problem11
{
	public static void main (String[] args) throws IOException
	{
		// Created a String variable firstLine to hold the first line of the file.
		String firstLine;

		// Created a String array called salesData to hold the values of the data. Initialized at start to null.
		String[] salesData = null;

		// Created a double array doubleData to hold the double values of the firstLine variable.
		double[] doubleData;

		// Called the display method created below. 
		display();

		// Opened the file SalesData.txt by creating a File object called file.
		File file = new File("/Users/NarenShridhar/Documents/JavaPrograms/ChapterNineProgrammingChallenges/SalesData.txt");

		// Created a new Scanner object inputFile, with the File object just created, file.
		Scanner inputFile = new Scanner(file);

		// Assign the firstLine variable to the first line of the inputFile object.
		firstLine = inputFile.nextLine();

		// (Best Practice) Trim the firstLine String.
		firstLine = firstLine.trim();

		// The salesData array is now equal to the Tokenized and trimmed firstLine Scanner object.
		salesData = firstLine.split(",");

		// Assign the size of the doubleData array.
		doubleData = new double[salesData.length];

		// For loop incremenets the index of array doubleData.
		for(int i = 0; i < doubleData.length; i ++)
		{
			// Assign the values of each doubleData index to the double of the salesData array.
			doubleData[i] = Double.parseDouble(salesData[i]);
		}

		// Print the total sales for each week.
		totalSalesPerWeek(doubleData);

		// Print the average daily sales for each week.
		averageDailySalesPerWeek(doubleData);

		// Print the total sales for all of the weeks.
		totalSales(doubleData);

		// Print the average weekly sales.
		averageWeeklySales(doubleData);

		// Print the week with the highest sales amount.
		System.out.println("5) The week with the highest sales amount was week: " + sequentialSearch(doubleData, getHighest(doubleData)));

		// Print an extra line for spacing.
		System.out.println();

		// Print the week with the lowest sales amount.
		System.out.println("6) The week with the lowest sales amount was week: " + sequentialSearch(doubleData, getLowest(doubleData)));
	}

	// Created a display method to display the program's objectives.
	public static void display()
	{
		System.out.println();
		System.out.println("User, this program will read a file called SalesData.txt, and will display the following:");
		System.out.println();
		System.out.println("1. The total sales for each week.");
		System.out.println("2. The average daily sales for each week.");
		System.out.println("3. The total sales for all of the weeks.");
		System.out.println("4. The average weekly sales.");
		System.out.println("5. The week number that had the highest amount of sales.");
		System.out.println("6. The week number that had the lowest amount of sales.");
		System.out.println();
	}

	// The totalSalesPerWeek method accepts a double array as an argument and returns the sales for each week.
	public static void totalSalesPerWeek(double[] doubleArrayGiven)
	{
		// For loop increments the index
		for (int i = 0; i < doubleArrayGiven.length; i++)
		{
			// Printed the sales for each week.
			System.out.println("1) The sales for week " + (i + 1) + " were: $" + doubleArrayGiven[i]);
		}

		// Extra line for spacing
		System.out.println();
	}

	// The averageDailySalesPerWeek method accepts a double array as an argument and returns the average sales for each day of the week.
	public static void averageDailySalesPerWeek(double[] doubleArrayGiven)
	{
		// For loop increments the index
		for(int i = 0; i < doubleArrayGiven.length; i ++)
		{
			// Printed the average daily sales for each week by taking the sales of each week and diving it by 7.0 (the days in a week).
			System.out.printf("2) The average daily sales for week " + (i + 1) + " was: $%.2f\n", doubleArrayGiven[i]/7.0);
		}

		// Extra line for spacing
		System.out.println();
	}

	// The totalSales method accepts a double array as an argument and returns the total sales for all the weeks combined.
	public static void totalSales(double[] doubleArrayGiven)
	{
		// Created a double variable totalSales and initialzied it to 0.0 to hold the total Sales for all the weeks.
		double totalSales = 0.0;

		// For loop increments the index
		for(int i = 0; i < doubleArrayGiven.length; i++)
		{
			// The total sales value is equal to total sales plus each value within the array.
			totalSales += doubleArrayGiven[i];
		}

		// Printed the total sales.
		System.out.printf("3) The total sales for all of the weeks was: $%.2f\n", totalSales);

		// Extra line for spacing
		System.out.println();
	}



	// The averageWeeklySales method accepts a double array as an argument and returns the average weekly sales from the total of all 7 weeks.
	public static void averageWeeklySales(double[] doubleArrayGiven)
	{
		// Created a double variable averageWeeklySales to hold the average sales of across all the weeks combined. 
		double averageWeeklySales = 0.0;

		// Created a double variable totalSalesTwo because I will need to replicate the totalSales method written above.
		double totalSalesTwo = 0.0;

		// For loop increments the index
		for(int i = 0; i < doubleArrayGiven.length; i++)
		{
			// The total sales value is equal to total sales plus each value within the array.
			totalSalesTwo += doubleArrayGiven[i];
		}

		// The average sales are equal to the total divided by the number of weeks, in this case 7.0. I could also use, doubleArrayGiven.length.
		averageWeeklySales = totalSalesTwo/7.0;

		// Print the average weekly sales.
		System.out.printf("4) The average weekly sales was: $%.2f\n", averageWeeklySales);

		// Extra line for spacing
		System.out.println();
	}

	// The getHighest method accepts a double array as an argument and returns the week with the highest sales.
	public static double getHighest(double[] doubleArrayGiven)
	{
		// Created a double variable highest to hold the highest week's total.
		double highest = doubleArrayGiven[0];

		// For loop increments the index
		for(int i = 1; i < doubleArrayGiven.length; i++)
		{
			// If the current value of the array is greater than highest...
			if(doubleArrayGiven[i] > highest)
			{
				// Set it to highest.
				highest = doubleArrayGiven[i];
			}
		}

		// Return the highest value.
		return highest;
	}

	// The getLowest method accepts a double array as an argument and returns the week with the lowest sales.
	public static double getLowest(double[] doubleArrayGiven)
	{
		// Created a double variable lowest to hold the lowest week's total.
		double lowest = doubleArrayGiven[0];

		// For loop increments the index
		for(int i = 1; i < doubleArrayGiven.length; i++)
		{
			// If the current value of the array is lower than lowest...
			if(doubleArrayGiven[i] < lowest)
			{
				// Set it to lowest.
				lowest = doubleArrayGiven[i];
			}
		}

		// Return the lowest value.
		return lowest;
	}

	// sequentialSearch method returns the position of the element being searched for.
	public static int sequentialSearch(double[] doubleArrayGiven, double searchValue)
	{
		// For loop increments the index
		for(int index = 0; index < doubleArrayGiven.length; index++)
		{
			// If the current index value equals the search value...
			if(doubleArrayGiven[index] == searchValue)
			{
				// Return the position (element) of the index. 
				return index + 1;
			}
		}

		// Else, return -1 indicating the value was not found.
		return -1;
	}
}