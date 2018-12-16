/* Created by Faiyaz Mostofa.
 * Starter Code used from: https://books.trinket.io/thinkjava/appendix-b.html
 * The class that manages the GUI of the main program. 
 * To-do:
 * 	- Create a working chat log
 * 	- Create a working graph that changes over time. */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GUI extends Canvas {
	
	/* Default Constructor. 
	 * Start up the GUI for the program. */
	public GUI() {
		JFrame frame = new JFrame("Current: ");
        setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
}
