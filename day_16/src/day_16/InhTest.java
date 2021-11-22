package day_16;

class A{
	int data =10;
	public A() {
		System.out.println("부모 클래스 생성자");
	}
	void show() {
		System.out.println("A 클래쓰");
	} 
	
}

class B extends A{
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("B클래스");
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
