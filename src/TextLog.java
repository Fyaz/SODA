/* Created by FIRE.
 * Concept for a chat log. NOT WORKING CODE. */

import java.awt.Component;
import java.awt.Graphics;

public class TextLog extends Component {
	
	private String log;
	
	public TextLog() {
		log = "";
		
	}
	
	public void push(String text) {
		log.concat(text);
		if(text.length() > 0 && text.charAt(text.length()-1) != '\n') {
			log.concat("\n");
		}
	}
	
	public void pop() {
		int i = log.length()-2;
		while(i > -1) {
			if(log.charAt(i) == '\n') {
				log = log.substring(0,i);
				break;
			}
		}
	}
	
	public void repaint(Graphics g) {
		g.drawString(log, 100, 100);
	}
	
}
