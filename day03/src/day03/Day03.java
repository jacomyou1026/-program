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
		String pw = null; //항상 초기화로 설정.
		System.out.println("pw :");
		pw = scan.next();
		System.out.println("암호화된 pw: ");
		for(int i=0;i<pw.length();i++)  {
			//System.out.printf("%c",((int)pw.charAt(i))-20);
			System.out.print((char)(pw.charAt(i)-10));
		}
		
		
	}

}
