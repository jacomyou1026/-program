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
		System.out.println("�귣�� :"+brand+"\n���� :"+color+"\n���� : "+price+"����");
		
	}
	public static void main(String[] args) {
		//��üȭ
		//�ν��Ͻ� ����
		//Ŭ������(): �⺻ ������
		//Ŭ������ �����ϸ� �ڵ����� ����Ǵ� ������
		
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
