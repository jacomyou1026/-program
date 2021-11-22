package day_12;

public class Overloading {
	
	
	void add(int num1,int num2) {
		System.out.println("두 정수의 합");
		System.out.println(num1+num2);
	}
	void add(int num1,int num2,int num3) {
		System.out.println("세 정수의 합");
		System.out.println(num1+num2+num3);
	}
	
	void add(double num1,double num2) {
		System.out.println("두 정수의 실수");
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		o.add(12, 23);
		o.add(12, 23, 2);
		o.add(123.32, 342.35);
	}

}
