/* Created by Faiyaz Mostofa.
 * Some starter code used from: https://books.trinket.io/thinkjava/appendix-b.html
 * The class that manages the GUI of the main program. 
 * To-do:
 * 	- Create a working chat log
 * 	- Create a working graph that changes over time. */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GUI extends Canvas {
	
	private TextLog textlog = new TextLog();
	
	/* Default Constructor. 
	 * Start up the GUI for the program. */
	public GUI() {
		JFrame frame = new JFrame("Current: ");
		textlog.push("Hello World!");
        setSize(400, 400);
        frame.add(textlog);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	/* This refreshes repeatedly. */
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);
		g.setColor(Color.GREEN);
		textlog.repaint(g);
	}
}
