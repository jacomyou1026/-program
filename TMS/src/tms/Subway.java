package tms;

import java.util.Random;

import javax.swing.JOptionPane;

public class Subway extends Public{
	int fee = 1200; // 요금
	
	@Override
	int pay(int money) {
			money-=fee;
		return money;
	}

	@Override
	String go(int btnIndex,int money) {
		//출발지와 도착지가 같은지 확인해주고
		//정방향인지 역방향인지 생각해서 for문을 돌아야 한다.
		//btnindex : 도착지
		//index : 출발지 (random)
		int cnt=0;
		int index;
		String result ="";
		Random r = new Random();
		while(true) {
			index =r.nextInt(arStation.length);
			if(btnIndex !=index) break;
		}
		
		cnt = btnIndex -index;
		if(money-fee <0) {
			result = "잔액부족";
		}else {
			result = ""+ pay(money)+","; // pay는 int 이기에  ""+ 을 통해 문자열로 바꿈
			result +=arStation[index]+">"; // 출발지는 항상 있기에 붙여줌//0
			if(cnt>0) {
				for (int i = 0; i <cnt ; i++) {
					//마지막 반복일지 아닐시 
					result +=i==cnt-1? arStation[index+i+1]: arStation[index+i+1]+">";
				}
			}else {
				//음수로 나오기에 음수로 넣을 수 없어서
				cnt*=-1;
				for (int i = 0; i <cnt; i++) {
					//index = 출발지
					result +=i==cnt-1? arStation[index-i-1]: arStation[index-i-1]+">";
				}
			showDesMsg(arStation[btnIndex]);
		}
	}
		return result;
		
}

	@Override
	void showDesMsg(String destination) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, destination+"에 도착했습니다.");
	}}
