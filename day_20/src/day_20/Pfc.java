package day_20;

public class Pfc implements Soldier {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �Ļ縦 �ϰ� ������ ì�ܾ� �Ѵ�");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ��ġ�� ������� �����, ���ӵ� �ϵ� ���þ� �Ѵ�.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �ð��� �� Ȱ���Ͽ� ������� �뷡���� �� �� �ִ�.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("�ῡ �� ������ ��ħ 6�� 30�п� ���� ������.");
	}

	@Override
	public void salute() {
		// TODO Auto-generated method stub
		System.out.println("��!��!");
	}

	public static void main(String[] args) {
		new Pfc().salute(); 
	}
}
