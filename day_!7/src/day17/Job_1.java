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

		System.out.println(name + "�� " + this.type + "�� " + this.local + "���� ������ �����Ѵ�.");
		System.out.println(name + "�� " + gender + "�̴�.");
		System.out.println(name + "�� " + money + " ���� �ִ�.");

	}
}

public class Job_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dentist ���� = new dentist("����", 23, "����", 20000, "������");
		Random r = new Random();
		String[] locale = { "�Ⱦ�", "����", "��õ" };
		int index = 0;
		index = r.nextInt(3);
		
		System.out.println(locale[index]);
		System.out.println(locale[index]);
		System.out.println(locale[index]);
		/*
		 * for (int i = 0; i < 10; i++) { ����.info(locale[index]); }
		 * 
		 */
	}

}
