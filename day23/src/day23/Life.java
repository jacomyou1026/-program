package day23;

public abstract class Life {
	//interface�� �ƴ� abstract���� ������ ����?
	//��� �ǻ�Ȱ���� �� �Ȱ��� �ʱ⿡ ���� ���ϴ� �κ������� �籸���ϱ� ����
	//������ ���� ������ �� �� �ֱ⿡
	
	static int floor =0;
	
	abstract void up();
	abstract void down();
	abstract void start(int choice);
	abstract void stop();	
	abstract void go();	
}
