package day03;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "Q.오늘은 당신의 생일입니다. \n" + "친구에게 상자를 선물로 받았습니다.\n" + "이 상자 안에는 무엇이 들어 있었을까요?\n" + "1.꽃\n" + "2.손수건\n"
				+ "3.깜짝 상자\n" + "4.보석\n"
						+ "나가기:q";
		Scanner scan = new Scanner(System.in);
		String num = "";
		String answer1 = "꽃 : 당신은 거짓말 x";
		String answer2 = "손수건 : 당신은 정직";
		String answer3 = "깜짝상자 : 당신은 거짓말 0";
		String answer4 = "보석 : 경우에 따라 거짓말";
		/*
		 * if (num == 1) { System.out.println(answer1); } else if (num == 2) {
		 * System.out.println(answer2);
		 * 
		 * } else if (num == 3) { System.out.println(answer3);
		 * 
		 * } else if (num == 4) { System.out.println(answer4);
		 * 
		 * }else { System.out.println("잘못누르셨습니다.");
		 * 
		 * }
		 */
		while (true) {
			System.out.println(q);
			num = scan.next();
			if(num.equals("q")) {
				System.out.println("종료");
				 break;
			}
			switch (num) {
			case "1":
				System.out.println(answer1);
				break;
			case "2":
				System.out.println(answer2);
				break;
			case "3":
				System.out.println(answer3);
				break;
			case "4":
				System.out.println(answer4);
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			System.out.println();
		}
	}

}
