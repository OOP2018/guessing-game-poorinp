package ui;

import java.util.Observable;

/**
 * Console for view the counter work properly.
 * @author Poorin Pichayamongkol
 */
public class ConsoleView implements java.util.Observer{

	private Counter counter;
	
	/**
	 * initialize the counter
	 * @param counter that will count the times that users guess the number.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}
	
	/**
	 * update the count from obserable
	 */
	@Override 
	public void update(Observable subject, Object info) {
		if (info != null) System.out.println(info); 
		System.out.println("Count: "+counter.getCount());
	}

}
