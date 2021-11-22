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
			//floor�� static�̱⿡ 1�� ��� ����.
			//i�� 1�� �����̱��̰� 
			for (int i = 0; i <=floor-choice+i; i++) {
				//0���� ���������� ����ǳ� ����ڿ��� �������� �ʴ´�.
				if(floor!=0) {
					System.out.println(floor+"��");
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
			//�������� �����ϱ��ϰ� �ϱ⿡ 
			// �ö� ��Ȳ
		}else if(choice!=floor) {
			for (int i = 0; i <= choice-floor+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"��");
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
			System.out.println("���� �� ���� �Ұ�");
		}
	}

	void stop() {
		System.out.println("�ܵ�����");
	}

	void go() {
		int choice = 0;
		String msg = "";
		while(true) {
			msg ="������ �Է��ϼ���(������ :"+floor+"��)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if(choice>maxFloor||choice<minFloor) {
				System.out.println("B3�� ���� 10�������� �����մϴ�.");
			}else {
				break;
			}
		}
		start(choice);
	}

}
