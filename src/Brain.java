/* Created by FIRE. 
 * Running the algorithm.
 * 
 *  Dilemma:
 *  Does it work like a linked list? It does physically yeah? CURRENT IMPLEMENTATION
 *  Can it be done like a hash function? ...*/

public class Brain {
	
	/* How the Brain feels. FOr now limited to 128 to -128. */
	private short feel;
	
	/* What was the last input had. */
	private short input;
	
	/* The array containing all the cells in the Brain. */
	private Cell root;
	
	/* Default Constructor. */
	public Brain() {
		feel = 0;
		input = 0;
		root = new Cell(0);
		
	}
	
	public String getOutput(String in) {
		
		return "";
	}
	
	
}
