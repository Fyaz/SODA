/* Created by FIRE. 
 * Running the algorithm.
 * 
 *  Dilemma:
 *  Does it work like a linked list? It does physically yeah?
 *  Can it be done like a hash function? ...*/

public class Brain {
	
	/* How the Brain feels. FOr now limited to 128 to -128. */
	private byte feel;
	
	/* What was the last input had. */
	private int input;
	
	/* The array containing all the cells in the Brain. */
	private Cell[] cells;
	
	/* Default Constructor. */
	public Brain() {
		feel = 0;
		input = 0;
		cells = new Cell[512];
		cells[384].made = true;
		cells[384].emote = -25;
		cells[384].output = ":(";
		
	}
	
	public String getOutput(String in) {
		
		return "";
	}
	
	
}
