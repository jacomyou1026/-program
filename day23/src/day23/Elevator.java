package day23;

import java.util.Scanner;

public class Elevator extends Life {
	final int maxFloor =10;
	final int minFloor=-3;
	@Override
	void up() {
		floor++;
	}

	@Override
	void down() {
		floor--;
	}

	void start(int choice) {
		if(choice<floor) {
			//floor는 static이기에 1씩 계속 감소.
			//i는 1씩 증가이기이게 
			for (int i = 0; i <=floor-choice+i; i++) {
				//0층은 내부적으로 실행되나 사용자에게 보여주진 않는다.
				if(floor!=0) {
					System.out.println(floor+"층");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				down();
			}
			stop();
			//위에꺼를 배제하기하고 하기에 
			// 올라갈 상황
		}else if(choice!=floor) {
			for (int i = 0; i <= choice-floor+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"층");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				up();
			}
			stop();
		}else {
			System.out.println("같은 층 선택 불가");
		}
	}

	void stop() {
		System.out.println("●도착●");
	}

	void go() {
		int choice = 0;
		String msg = "";
		while(true) {
			msg ="층수를 입력하세요(현재층 :"+floor+"층)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if(choice>maxFloor||choice<minFloor) {
				System.out.println("B3층 부터 10층까지만 가능합니다.");
			}else {
				break;
			}
		}
		start(choice);
	}

}
