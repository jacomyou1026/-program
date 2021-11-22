package day23;

public class Try {
	public static void main(String[] args) {
		try {
			System.out.println(10/1);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("0이다.");
		}
		
	}
}
