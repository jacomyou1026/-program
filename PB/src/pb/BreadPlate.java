package pb;

public class BreadPlate {
	private int breadCnt =0;
	public static int cnt =1;
public synchronized void makeBread() {
		if(breadCnt>9) {
			System.out.println("���� ���� á���ϴ�.");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			breadCnt++;
			System.out.println("���� 1�� ��������ϴ�. �� : "+breadCnt+"��"); 
		}
	}
	
public synchronized void eatBread() {
		if(cnt==20) {
			System.out.println("���� �� ���������ϴ�.");
		}else if(breadCnt<1) {
			System.out.println("���� �����ϴ�. ���� ������ ��ٷ� �ּ���");
		}else {
			breadCnt--;
			cnt++;
			System.out.println("���� 1�� �Ծ����ϴ�. �� : "+breadCnt+"��");
			if(breadCnt<10) {
				this.notify();
			}
		}
	}
	
}
