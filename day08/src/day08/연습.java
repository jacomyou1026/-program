
package day08;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String pw = null;
		System.out.println("pw :");
		pw = scan.next();
		System.out.println("��ȣȭ�� pw: ");
		for(int i=0;i<pw.length();i++) {
			System.out.println((pw.charAt(i)-10));
		}
	}

}
