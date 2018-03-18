package ui;

import java.util.Observable;

public class ConsoleView implements java.util.Observer{

	private Counter counter;
	
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}
	
	@Override 
	public void update(Observable subject, Object info) {
		if (info != null) System.out.println(info); 
		System.out.println("Count: "+counter.getCount());
	}

}
