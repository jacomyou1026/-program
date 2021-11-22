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
			System.out.println("숫자를 입력해주세요 끝내고 싶다면 'q'를 눌러주세요");
			unum =scan.nextInt();
			if(unum==1000) {
				System.out.println(rnum+"정답입니다.");				
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
				System.out.println(count+"만에 맞추었습니다.");
				break;
			}
			
		}
		
	}

}
