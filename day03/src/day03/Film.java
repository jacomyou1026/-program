package day03;

import java.util.Scanner;

/*
 * ������� ����?
 * 1.�ƴ�
 * 2.�׷�
 * 3.�̹� �Ծ���
 * 4.��� ������ ����?
 * 
 */
public class Film {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "�� ������ ����?\n"
				+ "1.�ƴ�\n"
				+ "2.�׷�\n"
				+ "3.�̹� �Ծ���\n"
				+ "4.��� ������ ����?\n";
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println(q);
		choice = scan.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("�׷�~");
			break;
		case 2 :
			System.out.print("�� �ʹ� ���� �߰�~");
			break;
		case 3 :
			System.out.print("�˾Ҿ�...");
			break;
		case 4 :
			System.out.print("�߰���!");
			break;
		default:System.out.println("�װ� ���� ��?");
		}
		
	}

}
