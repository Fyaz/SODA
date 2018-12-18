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
	
	private TextLog textlog = new TextLog();
	
	/* Default Constructor. 
	 * Start up the GUI for the program. */
	public GUI() {
		// Configure the window
		setName("defaultname");
        setSize(1280, 720);
        
        // Configure components
        textlog.push("Hello World!");
        textlog.push("HAHAHA!");
        textlog.pop();
        textlog.pop();
        textlog.pop();
        textlog.setSize(textlog.getPreferredSize());
        textlog.setBackground(new Color(51,51,51));
        textlog.setForeground(new Color(255,255,255));
        
        // Add components to the Window
        add(textlog);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	/* Constructor.
	 * */
	public GUI(String name) {
		// Configure the window
		setName("defaultname");
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      
		// Configure components
		textlog.setSize(textlog.getPreferredSize());
		textlog.setBackground(new Color(51,51,51));
		textlog.setForeground(new Color(255,255,255));
		        
		// Add components to the Window
		add(textlog);
		setVisible(true);
	}
	
	public void addText(String text) {
		textlog.push(text);
	}
}
