package day_16;

public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {
		System.out.println("�ڽ� Ŭ������ �⺻ ������");
	}
	public SuperCar(String brand,String color, int price,String mode) {
		super(brand,color,price);
//		setPrice(price);
		this.mode = mode;
		
	}
	@Override
	void enginStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	@Override
	void enginStop() {
		System.out.println("�������� �õ� ��");
	}
	@Override
	public String toString() {
		return "--------------------------------------------------------------\n"
				+ "�귣�� : "+brand+"\n���� :"+color+"\n���� :"+getPrice()+"����"
						+ "\n--------------------------------------------------------------\n"
;
	}
	
}
