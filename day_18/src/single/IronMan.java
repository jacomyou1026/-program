package single;

public class IronMan {
	
	private IronMan() {} //객체를 더이상 만들수 없게 private으로 막아줌
	
	public static IronMan getInstance() { //외부에서 클래스로 직접 접근할 때 static
		IronMan im = new IronMan();
		return im;
	}
	public static void fight(){
		System.out.println("빔 발사");
	}
	public void walk() {
		System.out.println("날아간다.");
	}
}
