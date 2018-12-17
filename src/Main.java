/* Created by FIRE.
 * THe main runner method. Run this to run the complete program. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//GUI graphics = new GUI();
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\n");
		String input = "";
		String output = "...";
		while(!input.contains("/exit")) {
			/* SODA responds. */
			System.out.print("SODA:\t");
			System.out.print(output);
			System.out.print("\n");
			
			/* Take an input. */
			System.out.print("You:\t");
			input = keyboard.next();
			output = input;
		}
	}
	
}
