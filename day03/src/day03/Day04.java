package day03;

import java.util.Scanner;

public class Day04 {
	/*Q1. 다음 중 프로그래밍 언어가 아닌 것으?
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String n1Msg ="첫번째 정수: ";
		String n2Msg ="두번쨰 정수: ";
		int num1 =0,num2=0;
		
		System.out.println(n1Msg);
		num1=sc.nextInt();
		System.out.println(n2Msg);
		num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("num1이 더 커요");
		}else if(num1==num2) {
			System.out.println("num1과 num2가 같아여");
		}else {
			System.out.println("num2가 더 커요");
		}
	}

}
