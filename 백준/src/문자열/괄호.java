package ���ڿ�;

import java.util.Scanner;

public class ��ȣ {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("��� �ݺ��� ���ΰ���?");
		int num = sc.nextInt();
		String s="";
		for (int i = 0; i <num; i++) {
			System.out.println("��ȣ�� �Է��ϼ���");
			s +=sc.next();
		}
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='(') {
					count++;
				}
				else if(s.charAt(i)==')'){
					count--;
					if(count<0) {
						count+=100;
					}
				}
			}
			if(count==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

