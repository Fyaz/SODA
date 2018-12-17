/* Created by FIRE.
 * Some starter code used from: https://books.trinket.io/thinkjava/appendix-b.html
 * The class that manages the GUI of the main program. 
 * To-do:
 * 	- Create a working chat log
 * 	- Create a working graph that changes over time. 
 *	  A simple 2 axis emotion graph */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.TextArea;

public class GUI extends JFrame {
	
	private TextArea textlog = new TextArea();
	
	/* Default Constructor. 
	 * Start up the GUI for the program. */
	public GUI() {
		setName("defaultname");
        setSize(1280, 720);
        textlog.setSize(getPreferredSize());
        add(textlog);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	/* Constructor.
	 * */
	public GUI(String name) {
		setName(name);
        setSize(1280, 720);
        textlog.setSize(getPreferredSize());
        add(textlog);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
}
