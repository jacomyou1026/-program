package day03;

import java.util.Random;
import java.util.Scanner;

public class UPdOWN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int rnum = ran.nextInt(100)+1;
		int unum = -1;
		String stop=null;
		int count = 0;
		while(rnum!=unum) {
			System.out.println("���ڸ� �Է����ּ��� ������ �ʹٸ� 'q'�� �����ּ���");
			unum =scan.nextInt();
			if(unum==1000) {
				System.out.println(rnum+"�����Դϴ�.");				
				break;
			}
			if(rnum<unum) {
				System.out.println("Down");
				count++;
			}
			else if(rnum>unum) {
				System.out.println("UP");
				count++;
			}
			
			
			else { 
				count++;
				System.out.println(count+"���� ���߾����ϴ�.");
				break;
			}
			
		}
		
	}

}
