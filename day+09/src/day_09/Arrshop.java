package day_09;


import javax.swing.JOptionPane;

public class Arrshop {
	/*
	 * 나이키 강남점, 홍대점, 명동점 
	 * 성인, 키즈
	 *  강남점K, 홍대점 K, 명동점K 
	 *  강남점A, 홍대점 A, 명동점A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrIncome = new int[2][3];
		int[] arAsum = new int[2]; // 연령별 sum
		int[] arBsum = new int[3];// 지점별 sum
		int sum = 0;// 총 매출액
		
		double[] aAvg = new double[2]; // 연령별 평균
		double[] bAvg = new double[3]; // 지점별 평균
		double avg = 0.0;
		
		int rLength =arrIncome.length; // 행의 길이
		int cLength = arrIncome[0].length;//열의 길이
		
		String result = "--------------------------------\n";
		String[][] arrName = { { "강남점A", "홍대점 A", "명동점A" }, 
										{ "강남점K", "홍대점 K", "명동점K" } };
		
		String[] arAName = {"성인","키즈"};
		String[] arBName = {"강남점","홍대점","명동점"};
		
		String inputMsg = "매출액을 입력하세요";

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
				 result += arrName[i][j]+"매출액 :"+arrIncome[i][j]+"만원\n"; //성인 매장
			}
			//연령별 매출액
			result+=  arAName[i]+"총 매출액 :"+arAsum[i]+"만원\n";
			result+=arAName[i]+"평균 매출액 :" +aAvg[i]+"만원\n";
			result +="----------------------------------\n";
		}
		//지점별  매출액
		for(int i=0;i<arBsum.length;i++) {
			result+=arBName[i]+"총 매출액 :"+arBsum[i]+"만원\n";
			result+=arBName[i]+"평균 매출액 :"+bAvg[i]+"만원\n";
			
		}
		result +="------------------------------------\n";
		result += "총 매출액 :"+sum+"만원\n";
		result +="평균 매출액:"+avg+"만원\n";
		result +="----------------------------------\n";

		JOptionPane.showMessageDialog(null, result);
	}

}