package day25;

public class Arr {
	public static void main(String[] args) {
		/*
		 * String[] arData = {"�ȳ�", "�ݰ���","�̸���","����?"}; for(String i : arData) {
		 * System.out.println(i); }
		 */
		int[][] arScore= {
				{10,20,30},
				{11,14,25},
				{35,34,23},
				{12,24,35},
				{23,34,32}
		};
		
		//�� �л��� ������ ��� ����ϱ�
		//���� for������ 
		int total=0;
		double avg =0.0;
		int cnt =0;
		for (int[] arrScore : arScore) {
			total=0;
			cnt++;
			for(int score:arrScore) {
				total+=score;
			}
			System.out.println(cnt+"�� ����"+total+"��");
			avg = Double.parseDouble(String.format("%.2f", (double)total/arrScore.length)); 
			System.out.println(cnt+"�� ��� : "+avg+"��");
			
		}
	}
}
