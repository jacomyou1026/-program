package Elevator2;

import java.util.Scanner;

public class Elevator extends Life{

	final int maxfloor = 10;
	final int minfloor = -5;
	
	
	
	void go() {
		// TODO Auto-generated method stub
		int choice= 0;
		String msg ="";
		while(true) {
			msg ="������ �Է��ϼ���(������ : "+floor+"��)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if(choice > maxfloor||choice <minfloor) {
				System.out.println("B5�� ���� 10�������� ����");
			}else {
				break;
			}
		}
		start(choice);
		close();
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("--����--");
	}

	
	@Override
	void up() {
		// TODO Auto-generated method stub
		floor++;
	}

	@Override
	void down() {
		// TODO Auto-generated method stub
		floor--;
		
	}

	void start(int choice) {
		// TODO Auto-generated method stub
		if(floor >choice) {			
			for (int i = 0; i <= floor-choice+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"��");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				down();
			}
			stop();
		}else if(floor!=choice) {
			for(int i =0;i<=choice-floor+i;i++) {
				if(floor!=0) {
					System.out.println(floor+"��");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				up();
			}
			stop();
		}

	}

	@Override
	void open() {
		// TODO Auto-generated method stub
		System.out.println("�ݹ��� �����ϴ�.��");

	}
	@Override
	void close() {
		// TODO Auto-generated method stub
		System.out.println("�ݹ��� �����ϴ�.��");
		
	}
}