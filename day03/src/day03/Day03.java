package day03;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int data = 'A'; char data2 =65; System.out.println(data);
		 * System.out.println(data2);
		 */
		
		Scanner scan = new Scanner(System.in);
		String pw = null; //�׻� �ʱ�ȭ�� ����.
		System.out.println("pw :");
		pw = scan.next();
		System.out.println("��ȣȭ�� pw: ");
		for(int i=0;i<pw.length();i++)  {
			//System.out.printf("%c",((int)pw.charAt(i))-20);
			System.out.print((char)(pw.charAt(i)-10));
		}
		
		
	}

}
