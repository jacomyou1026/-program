package day17;

import java.util.Random;

class dentist extends Person {
	public String type;
	public String local;
	int income = 20_000;

	public dentist(String name, int age, String gender, int money, String type) {
		super(name, age, gender, money);
		this.type = type;
	}

	int count = 0;

	void info(String local) {
		count++;
		if (count % 10 == 0)
			income *= 1.5;

		this.local = local;
		money += income;

		System.out.println(name + "은 " + this.type + "의 " + this.local + "에서 병원을 운행한다.");
		System.out.println(name + "은 " + gender + "이다.");
		System.out.println(name + "은 " + money + " 원이 있다.");

	}
}

public class Job_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dentist 서희 = new dentist("서희", 23, "여자", 20000, "교정과");
		Random r = new Random();
		String[] locale = { "안양", "서울", "인천" };
		int index = 0;
		index = r.nextInt(3);
		
		System.out.println(locale[index]);
		System.out.println(locale[index]);
		System.out.println(locale[index]);
		/*
		 * for (int i = 0; i < 10; i++) { 서희.info(locale[index]); }
		 * 
		 */
	}

}
