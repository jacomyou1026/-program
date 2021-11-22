package day03;

import java.util.Scanner;

/*
 * 밥먹으로 갈래?
 * 1.아니
 * 2.그래
 * 3.이미 먹었어
 * 4.어떤거 먹으로 갈까?
 * 
 */
public class Film {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "밥 먹으로 갈래?\n"
				+ "1.아니\n"
				+ "2.그래\n"
				+ "3.이미 먹었어\n"
				+ "4.어떤거 먹으로 갈까?\n";
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println(q);
		choice = scan.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("그래~");
			break;
		case 2 :
			System.out.print("넌 너무 쉬어 잘가~");
			break;
		case 3 :
			System.out.print("알았어...");
			break;
		case 4 :
			System.out.print("닭갈비!");
			break;
		default:System.out.println("그게 무슨 말?");
		}
		
	}

}
