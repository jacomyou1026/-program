package day03;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		String q = "1.����ϱ�\n" + "2.������";
		int num1 = 0, num2 = 0;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(q);
			choice = scan.nextInt();
			String result = "";
			if (choice == 1) {
				System.out.println("����� �Ͻÿ�");
				num1 = scan.nextInt();
				String oper = scan.next();
				num2 = scan.nextInt();
				switch (oper) {
				case "+":
					result = "" + (num1 + num2);
					break;
				case "-":
					result = "" + (num1 - num2);
					break;
				case "*":
					result = "" + (num1 * num2);
					break;
				case "/":
					if (num2 != 0) {
						result = "" + (num1 / num2);
					} else {
						result = "0���� ���� �� ����.";
					}
					break;
				default:
					result = "��Ģ���� ���� �����ڴ� ���x";
				}
				System.out.println(result);
			} else if (choice == 2) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("?");
				continue;
			}
		}
	}

}
