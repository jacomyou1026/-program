package day_16;

class A{
	int data =10;
	public A() {
		System.out.println("�θ� Ŭ���� ������");
	}
	void show() {
		System.out.println("A Ŭ����");
	} 
	
}

class B extends A{
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("BŬ����");
	}
	void check() {
		show();
	}
}

public class InhTest {
public static void main(String[] args) {
	B b = new B();
	b.check();
}
}
