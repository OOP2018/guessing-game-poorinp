package ui;

/**
 * Counting the times that users guess the number
 * @author Poorin Pichayamongkol
 */
public class Counter extends java.util.Observable {

	private int count;
	
	/**
	 * initialize the number of counter
	 */
	public Counter() {
		this.count = 0;
	}
	
	/**
	 * add the number of time that users guess the number then notify the observer
	 * @param number is the number of counter will add, certainly is one.
	 */
	public void add(int number) {
		count++;
		setChanged();
		notifyObservers();
	}
	
	/**
	 * get the number of times that users guess the number
	 * @return count that is the number of times that users guessed.
	 */
	public int getCount() {
		return count;
	}
}
