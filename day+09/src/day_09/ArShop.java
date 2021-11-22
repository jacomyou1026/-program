package day_09;

import java.util.Scanner;

public class ArShop {
	/*
	 * ZARA 
	 * 강남점,코엑스점, 명동점 지점 
	 * 총 매출(단원:백만원) 평균 매출액(단위 : 만원)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] market = { "강남점", "코엑스점", "명동점" };
		int[] market_t = new int[3];
		double avg = 0.0;
		int sum = 0;
		int cnt =0;
		String best ="없다.";
		for (int i = 0; i < market.length; i++) {
			System.out.println(market[i] + "의 평균 매출액 (단위 : 만원)");
			market_t[i] = sc.nextInt();
			sum += market_t[i];
		}
		System.out.println("총 매출(단원:백만원) ");
		avg =Double.parseDouble(String.format("%.2f", (double)sum/market_t.length)); 
		System.out.println("ZARA 총 매출액:"+sum+"백만원");
		System.out.println("평균 매출액 :"+avg+"만원");
		
		/*
		 * 인센티브 매점
		 */
 		for(int i=0;i<market_t.length;i++) {
			if(market_t[i]>avg) {
				//기존 초기화가 '없음'임으로 이곳으로 들어오면 초기화를 새로해줌
				//그후 누적연결
				cnt++;
				if(cnt == 1) {
					best="";
				}
				best += market[i]+"\n";
			}
		}
		System.out.println("★인센티브 매장★\n"+best);
		
	}
}
