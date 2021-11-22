package day_16;

public class CarTest {
	public static void main(String[] args) {

	 SuperCar	farrari = new SuperCar();
	 SuperCar	farrari2  = new SuperCar("farrari","Red",45000,"sport");
	 System.out.println(farrari2);
	 farrari.enginStart();
	 farrari.enginStop();
	}
}
