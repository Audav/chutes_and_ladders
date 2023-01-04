package console;

import java.util.Scanner;

/**
 * Helper class for reading and writing to the Java console.
 *
 * @author Josh Archer, edited by Aubrey Davies
 * @version 2.0
 */
public class Console
{
	private static Scanner console = new Scanner(System.in);

	/**
	 * Prompts the user and retrieves an int value from the Java console.
	 *
	 * @param prompt a prompt for the user to read before
	 * entering input
	 * @return an int value
	 */
	public static int getInt(String prompt)
	{
		System.out.print(prompt);
		return getInt();
	}

	/**
	 * Retrieves an int value from the Java console.
	 *
	 * @return an int value
	 */
	public static int getInt()
	{
		while (!console.hasNextInt())
		{
			System.out.print("Please enter a valid integer: ");

			//clear the scanner buffer
			console.nextLine();
		}

		int result = console.nextInt();

		//clear the scanner buffer
		console.nextLine();

		return result;
	}

}
