package day_09;


import javax.swing.JOptionPane;

public class Arrshop {
	/*
	 * ����Ű ������, ȫ����, ���� 
	 * ����, Ű��
	 *  ������K, ȫ���� K, ����K 
	 *  ������A, ȫ���� A, ����A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrIncome = new int[2][3];
		int[] arAsum = new int[2]; // ���ɺ� sum
		int[] arBsum = new int[3];// ������ sum
		int sum = 0;// �� �����
		
		double[] aAvg = new double[2]; // ���ɺ� ���
		double[] bAvg = new double[3]; // ������ ���
		double avg = 0.0;
		
		int rLength =arrIncome.length; // ���� ����
		int cLength = arrIncome[0].length;//���� ����
		
		String result = "--------------------------------\n";
		String[][] arrName = { { "������A", "ȫ���� A", "����A" }, 
										{ "������K", "ȫ���� K", "����K" } };
		
		String[] arAName = {"����","Ű��"};
		String[] arBName = {"������","ȫ����","����"};
		
		String inputMsg = "������� �Է��ϼ���";

		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				arrIncome[i][j]= Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j] + " " + inputMsg));
				arAsum[i] += arrIncome[i][j];
				arBsum[j] += arrIncome[i][j];
				sum += arrIncome[i][j];

			}
		}
		for (int i = 0; i < aAvg.length; i++) {
			aAvg[i] = Double.parseDouble(String.format("%.2f", (double) arAsum[i] / arBsum.length));
		}
		for (int i = 0; i < bAvg.length; i++) {
			bAvg[i] = Double.parseDouble(String.format("%.2f", (double) arBsum[i] / arAsum.length));
		}
		avg =Double.parseDouble(String.format("%.2f",(double) sum/(rLength*cLength)));
		
		for (int i = 0; i < rLength; i++) {
			for (int j = 0; j < cLength; j++) {
				 result += arrName[i][j]+"����� :"+arrIncome[i][j]+"����\n"; //���� ����
			}
			//���ɺ� �����
			result+=  arAName[i]+"�� ����� :"+arAsum[i]+"����\n";
			result+=arAName[i]+"��� ����� :" +aAvg[i]+"����\n";
			result +="----------------------------------\n";
		}
		//������  �����
		for(int i=0;i<arBsum.length;i++) {
			result+=arBName[i]+"�� ����� :"+arBsum[i]+"����\n";
			result+=arBName[i]+"��� ����� :"+bAvg[i]+"����\n";
			
		}
		result +="------------------------------------\n";
		result += "�� ����� :"+sum+"����\n";
		result +="��� �����:"+avg+"����\n";
		result +="----------------------------------\n";

		JOptionPane.showMessageDialog(null, result);
	}

}