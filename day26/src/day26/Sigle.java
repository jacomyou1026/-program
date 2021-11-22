package day26;

public class Sigle {
	
	private Sigle(){
	}
	private static Sigle instance = new Sigle();
	
	public static Sigle getInstance() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("¾È³ç");
	}
}
