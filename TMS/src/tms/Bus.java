package tms;

import java.util.Random;

import javax.swing.JOptionPane;

public class Bus extends Public{
	int fee = 1200; // ���
	
	@Override
	int pay(int money) {
			money-=fee;
		
		return money;
	}

	@Override
	String go(int btnIndex,int money) {
		//������� �������� ������ Ȯ�����ְ�
		//���������� ���������� �����ؼ� for���� ���ƾ� �Ѵ�.
		//btnindex : ������
		//index : ����� (random)
		int cnt=0;
		int index;
		String result ="";
		Random r = new Random();
		while(true) {
			index =r.nextInt(arStation.length);
			if(btnIndex>index) break;
		}
		cnt = btnIndex -index;
		if(money-fee <0) {
			result = "�ܾ׺���";
		}else {
			result = ""+ pay(money)+","; // pay�� int �̱⿡  ""+ �� ���� ���ڿ��� �ٲ�
			result +=arStation[index]+">"; // ������� �׻� �ֱ⿡ �ٿ���  - 0 
			for (int i = 0; i <cnt ; i++) {
				//������ �ݺ����� �ƴҽ� 
				result +=i==cnt-1? arStation[index+i+1]: arStation[index+i+1]+">";
			}
			showDesMsg(arStation[btnIndex]);
		}
		return result;
	}
	
	@Override
	void showDesMsg(String destination) {
		JOptionPane.showMessageDialog(null, destination+"�� �����߽��ϴ�");
	}

}
