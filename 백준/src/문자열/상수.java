package ���ڿ�;

import java.util.Scanner;

public class ��� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���!");
		String[] num=new String[2]; 
		int[] num1=new int[2];
		for (int i = 0; i < num.length; i++) {
				num[i] = sc.next();
				StringBuffer sb =new StringBuffer(num[i]);
				num[i]=sb.reverse().toString();
				num1[i] = Integer.parseInt(num[i]);
		}
		if(num1[0]>num1[1]) {
			System.out.println(num1[0]);
		}else {
			System.out.println(num1[1]);
		}
	}
}
