package day_18;

class Car{
	String brand;
	String color;
	int price;
	public Car() {
		
	}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void enginStart() {
		System.out.println("����� �õ� Ű");
	}
	
	void enginStop() {
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {}
	
	public SuperCar(String mode,String brand, String color, int price) {
		super(brand,color,price);
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode=newMode;
		System.out.println("��尡 �ٲ�����ϴ�.");
	}
	
	@Override
	void enginStart() {
		System.out.println("�������� �õ� Ŵ");
	}

	@Override
	void enginStop() {
		System.out.println("�������� �õ� ��");
		
	}
	
}


public class CasttingTest {
	public static void main(String[] args) {
		//up casting
		Car noOptionFerrari = new SuperCar();
		//noOptionFerrari.enginStart();
		
		//down casting : ����
//		SuperCar brokenCar = (SuperCar) new Car();
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		if(car instanceof Car) {
			System.out.println("nice casting ");
		}else {
			System.out.println("err : wrong casting");
		}
		if(ferrari instanceof Car) 	{
			System.out.println("nice casting ");
		}else {
			System.out.println("err : wrong casting");
		}
		if(car instanceof SuperCar) 	{
			System.out.println("nice casting ");
		}else {
			System.out.println("err : wrong casting");
		}
		
		if(noOptionFerrari instanceof Car){
			System.out.println("nice casting ");
		}else {
			System.out.println("err : wrong casting");
		}
		
		
		
	}
}
