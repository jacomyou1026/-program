package day03;

import java.util.Scanner;

public class Day04 {
	/*Q1. ���� �� ���α׷��� �� �ƴ� ����?
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String n1Msg ="ù��° ����: ";
		String n2Msg ="�ι��� ����: ";
		int num1 =0,num2=0;
		
		System.out.println(n1Msg);
		num1=sc.nextInt();
		System.out.println(n2Msg);
		num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("num1�� �� Ŀ��");
		}else if(num1==num2) {
			System.out.println("num1�� num2�� ���ƿ�");
		}else {
			System.out.println("num2�� �� Ŀ��");
		}
	}

}
