package day21;

public class Board {
	public static void main(String[] args) {
		//인스턴스(객체)는 주소값 넘어감
		
		new Rect().draw(10, 40);
		new Tri().draw(32, 34.3);
		
		//static으로 접근은 주소값 안넘어감 - 
		shape.function();
	}
}
