package ui;


public class Counter extends java.util.Observable {

	private int count;
	
	public Counter() {
		this.count = 0;
	}
	
	public void add(int number) {
		count++;
		setChanged();
		notifyObservers();
	}
	
	public int getCount() {
		return count;
	}
}
