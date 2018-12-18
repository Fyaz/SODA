/* Created by FIRE.
 * Concept for a chat log. NOT WORKING CODE. */

import java.awt.Component;
import java.awt.Graphics;
import java.awt.TextArea;

import javax.swing.JTextArea;

public class TextLog extends JTextArea {
	
	private String LOG;
	private int num_messages;
	
	public TextLog() {
		LOG = "";
		num_messages = 0;
	}
	
	public void push(String text) {
		LOG += text;
		if(text.length() > 0 && text.charAt(text.length()-1) != '\n') {
			LOG += "\n";
		}
		num_messages++;
		setText(LOG);
	}
	
	public void pop() {
		if(num_messages == 1) {
			LOG = "";
		}
		else {
			int i = LOG.length()-2;
			while(i > -1) { 
				if(LOG.charAt(i) == '\n') {
					LOG = LOG.substring(0, i);
					break;
				}
				i--;
			}
		}
		num_messages--;
		setText(LOG);
	}
	
	public int Size() { return num_messages; }
	
}
