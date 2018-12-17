/* Created by FIRE. 
 * Neurons. */

public class Cell {
	
	/* Is the current cell formed or no? */
	public boolean made;
	
	/* How does the particular input affect the Brian. */
	public int emote;
	
	/* How does the Brain respond at this Cell? */
	public String output;
	
	/* Basic constructor. */
	public Cell() {
		made = false;
		emote = 0;
		output = "";
	}

}
