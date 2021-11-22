package single;

public class IronMan {
	
	private IronMan() {} //��ü�� ���̻� ����� ���� private���� ������
	
	public static IronMan getInstance() { //�ܺο��� Ŭ������ ���� ������ �� static
		IronMan im = new IronMan();
		return im;
	}
	public static void fight(){
		System.out.println("�� �߻�");
	}
	public void walk() {
		System.out.println("���ư���.");
	}
}
