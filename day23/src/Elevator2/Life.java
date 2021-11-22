package Elevator2;

public abstract class Life {
	static int floor =0;
	
	abstract void go(); 
	abstract void stop();
	abstract void start(int choice);
	abstract void up();
	abstract void down();
	abstract void open();
	abstract void close();
}
 