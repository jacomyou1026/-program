package day21;

public abstract class shape {	
	double area;
	public abstract void draw(double w,double h);
	
	//final�� ������ �Ұ�
	final static void function() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼��� �Դϴ�.");
	}
}

class Rect extends shape{

	@Override
	public void draw(double w, double h) {
		System.out.println("���簢�� �� 4�� ����");
		area = w*h;
		System.out.println("���� : "+area);
	}
	
}
class Tri extends shape{

	@Override
	public void draw(double w, double h) {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ�� �� 3�� ����");
		area = (w*h)/2;
		System.out.println("���� : "+area);
	}
}
