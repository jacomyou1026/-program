package day_16;

public class Car {
	final int wheel =4;
	 public String brand;
	 protected String color;
	 private int price;
	 
	 public Car() {
		// TODO Auto-generated constructor stub
		 System.out.println("�θ� Ŭ������ �⺻ ������");
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		//����� �ʱ�ȭx
	}
	void enginStart() {
		System.out.println("����� �õ� Ű");
	}
	 
	 void enginStop() {
		 System.out.println("����� �õ� ��");
		 
	 }
	 
	 //private�̱⿡ getter, setter�� ����� ��
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	 

}
