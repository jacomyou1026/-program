package day03;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "Q.������ ����� �����Դϴ�. \n" + "ģ������ ���ڸ� ������ �޾ҽ��ϴ�.\n" + "�� ���� �ȿ��� ������ ��� �־������?\n" + "1.��\n" + "2.�ռ���\n"
				+ "3.��¦ ����\n" + "4.����\n"
						+ "������:q";
		Scanner scan = new Scanner(System.in);
		String num = "";
		String answer1 = "�� : ����� ������ x";
		String answer2 = "�ռ��� : ����� ����";
		String answer3 = "��¦���� : ����� ������ 0";
		String answer4 = "���� : ��쿡 ���� ������";
		/*
		 * if (num == 1) { System.out.println(answer1); } else if (num == 2) {
		 * System.out.println(answer2);
		 * 
		 * } else if (num == 3) { System.out.println(answer3);
		 * 
		 * } else if (num == 4) { System.out.println(answer4);
		 * 
		 * }else { System.out.println("�߸������̽��ϴ�.");
		 * 
		 * }
		 */
		while (true) {
			System.out.println(q);
			num = scan.next();
			if(num.equals("q")) {
				System.out.println("����");
				 break;
			}
			switch (num) {
			case "1":
				System.out.println(answer1);
				break;
			case "2":
				System.out.println(answer2);
				break;
			case "3":
				System.out.println(answer3);
				break;
			case "4":
				System.out.println(answer4);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				continue;
			}
			System.out.println();
		}
	}

}
