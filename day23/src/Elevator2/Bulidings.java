package Elevator2;

import java.util.Random;
import java.util.Scanner;

public class Bulidings {
	public static void main(String[] args) {
		Elevator e = new Elevator();
		Random r = new Random();
		int cnt = 0;
		int floor = 0;
		String check = "";
		int[] arElevator = new int[5];
		cnt = r.nextInt(6);
		for (int i = 0; i < cnt; i++) {
			arElevator[i] = 1;
		}
		while (true) {
			floor = r.nextInt(e.maxfloor + (e.minfloor * -1) + 1) + e.minfloor;
			if (floor != 0)
				break;
		}
		e.open();
		if (cnt == 0) {
			System.out.println("현재 탑승 인원 : 없음(최대 5명)");
		} else {
			System.out.println("현재 탑승 인원" + cnt + "명(최대 5명)");
		}
		System.out.println("Y : 타기 ------------- N : 보내기");
		check = new Scanner(System.in).next().toUpperCase();
		if (check.equals("Y")) {
			cnt++;
			try {
				arElevator[cnt - 1] = 1;
				Elevator.floor = floor;
				e.go();
			} catch (Exception e1) {
				System.out.println("정원 초과");
			}} else if (check.equals("N")) {
				cnt--;
				System.out.println("현재 인원 수 : "+cnt+" 원입니다.!");
				Elevator.floor =floor;
				e.go();
		}
	}
}
