package day_09;

import java.util.Scanner;

public class ArShop {
	/*
	 * ZARA 
	 * ������,�ڿ�����, ������ ���� 
	 * �� ����(�ܿ�:�鸸��) ��� �����(���� : ����)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] market = { "������", "�ڿ�����", "������" };
		int[] market_t = new int[3];
		double avg = 0.0;
		int sum = 0;
		int cnt =0;
		String best ="����.";
		for (int i = 0; i < market.length; i++) {
			System.out.println(market[i] + "�� ��� ����� (���� : ����)");
			market_t[i] = sc.nextInt();
			sum += market_t[i];
		}
		System.out.println("�� ����(�ܿ�:�鸸��) ");
		avg =Double.parseDouble(String.format("%.2f", (double)sum/market_t.length)); 
		System.out.println("ZARA �� �����:"+sum+"�鸸��");
		System.out.println("��� ����� :"+avg+"����");
		
		/*
		 * �μ�Ƽ�� ����
		 */
 		for(int i=0;i<market_t.length;i++) {
			if(market_t[i]>avg) {
				//���� �ʱ�ȭ�� '����'������ �̰����� ������ �ʱ�ȭ�� ��������
				//���� ��������
				cnt++;
				if(cnt == 1) {
					best="";
				}
				best += market[i]+"\n";
			}
		}
		System.out.println("���μ�Ƽ�� �����\n"+best);
		
	}
}