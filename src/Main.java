/* Created by FIRE.
 * THe main runner method. Run this to run the complete program. */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//GUI window = new GUI();
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\n");
		String input = "";
		String response = "...";
		while(!input.contains("/exit")) {
			// SODA responds.
			System.out.print("SODA:\t");
			System.out.print(response);
			System.out.print("\n");
			//window.addText("SODA:\t" + response + "\n");
			
			// Take an input
			System.out.print("You:\t");
			input = keyboard.next();
			response = input;
			//window.addText("You:\t" + input);
		}
		System.exit(0);
	}
	
}
