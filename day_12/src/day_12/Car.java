package day_12;

public class Car {
	int price;
	String color;
	String brand;
	
	//overloading
	Car(){
		
	}
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}
	

	double speedUp(double speed){
		speed++;
		return speed;
	}
	double speedDown(double speed){
		speed--;
		return speed;
		
	}
	void showInfo() {
		System.out.println(this);
		System.out.println("브랜드 :"+brand+"\n색상 :"+color+"\n가격 : "+price+"만원");
		
	}
	public static void main(String[] args) {
		//객체화
		//인스턴스 변수
		//클래스명(): 기본 생성자
		//클래스를 선언하면 자동으로 선언되는 생성자
		
		Car dadycar=new Car(800,"black","Benz");
		Car momcar =new Car();
		Car mycar=new Car();
		dadycar.showInfo();
		
//		momcar.brand="Benz";
//		momcar.color="black";
//		momcar.price=2000;
//		
//		momcar.showInfo();
//		System.out.println(momcar);
		
		
	}
}
