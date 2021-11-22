package day23;

public abstract class Life {
	//interface가 아닌 abstract으로 구현한 이유?
	//모든 실생활에는 다 똑같지 않기에 내가 원하는 부분적으로 재구현하기 위해
	//층수는 내가 수정할 수 도 있기에
	
	static int floor =0;
	
	abstract void up();
	abstract void down();
	abstract void start(int choice);
	abstract void stop();	
	abstract void go();	
}
