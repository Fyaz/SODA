/* Created by FIRE. 
 * Neurons. */

import java.util.TreeSet;

public class Cell implements Comparable {
	
	private int input;		// What is the cell reacting to? 
	private String output;	// When the cell reacts, does it do anything?
	private int emote;		// How does the cell react?
	
	private TreeSet<Cell> connected;	// A list of all the other cells that this one is connected to.
	
	// Constructors ==================================================================
	
	/* Constructor. 
	 * Input: _input = the input of the cell. What it is reacting to? */
	public Cell(int _input) {
		input = _input;
		output = "";
		emote = 0;
		connected = new TreeSet<Cell>();
	}
	
	/* Constructor. */
	public Cell(int _input, String _output, int _emote) {
		input = _input;
		output = _output;
		emote = _emote;
		connected = new TreeSet<Cell>();
	}
	
	// Access methods ==============================================================
	
	public int getInput() { return input; }
	public String getOutput() { return output; }
	public int getEmote() { return emote; }
	
	public boolean isConnected(int _input) {
		return connected.contains(new Cell(_input));
	}
	
	public void setInput(int _input) { input = _input; }
	public void setOutput(String _output) { output = _output; }
	public void setEmote(int _emote) { emote = _emote; }
	
	// Modifier methods ==============================================================
	
	/* Connect a new cell to this cell */
	public void add(Cell other) {
		connected.add(other);
	}

	@Override
	public int compareTo(Object o) {
		Cell other = (Cell) o;
		if(input < other.input)
			return -1;
		if(input > other.input)
			return 1;
		return 0;
	}
	
}
