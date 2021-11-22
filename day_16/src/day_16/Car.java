package day_16;

public class Car {
	final int wheel =4;
	 public String brand;
	 protected String color;
	 private int price;
	 
	 public Car() {
		// TODO Auto-generated constructor stub
		 System.out.println("부모 클래스의 기본 생성자");
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		//상수는 초기화x
	}
	void enginStart() {
		System.out.println("열쇠로 시동 키");
	}
	 
	 void enginStop() {
		 System.out.println("열쇠로 시동 끔");
		 
	 }
	 
	 //private이기에 getter, setter로 만들어 줌
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	 

}
