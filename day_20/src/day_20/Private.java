package day_20;

public class Private implements Soldier{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("õõ�� ���� �缭 90���� �ɾƼ� �Դ´�.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("���� ������ �������� ������� ����.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ���Ƽ� �޿��� ���.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		play();
		System.out.println("���� ���� ���Ѵ�.");
	}

	@Override
	public void salute() {
		// TODO Auto-generated method stub
		System.out.println("��!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!��");
	}
	
}
