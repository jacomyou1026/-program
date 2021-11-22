package day_19;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h);
	
	//final�ϴ� ���� : �ڽ�Ŭ�������� �������ϴ� ���� ��������
	//						��븸 �ϱ�����
	final void function() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼����Դϴ�.");
	}
	
}
class Rect extends Shape{
	@Override
	void showArea(double w, double h) {
		area = w * h;
		System.out.println("���� : "+area+"cm��");
	}
	
}
class Tri extends Shape{
	@Override
	void showArea(double w, double h) {
		// TODO Auto-generated method stub
		area = (w*h)/2;
		System.out.println("���� : "+area+"cm��");
	}
	
}
