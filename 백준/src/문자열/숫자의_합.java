package ���ڿ�;

import java.util.Scanner;

public class ������_�� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = scan.nextInt();
		int sum = 0;
		String str = scan.next();
		for (int i = 0; i < num; i++) {
			sum+=str.charAt(i)-'0';
		}
		
		System.out.println(sum);
	}
}
