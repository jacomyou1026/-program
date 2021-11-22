import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Bugger {
	int price;
	boolean p_check;
	String msg;
	int check;
	String menu;
	boolean checkin() {
	
		p_check=true;
		boolean cCheck=false;
		int count = 0; // 수량
		int age = 0;
		count = Integer.parseInt(JOptionPane.showInputDialog("수량을 입력하세요!"));
		if (check == 1) {
		price = 7200 * count;
		} else if (check == 2) {
			price = 3300 * count;
		} else if (check == 3) {
			price = 2200 * count;
		} else if (check == 4) {
			age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력해 주세요"));
			if (age < 8) {
				p_check = false;
				check = JOptionPane.showConfirmDialog(null, "8살 미만은 매울 수 있습니다.", "Warming",
						JOptionPane.WARNING_MESSAGE);

			} else {
				price = 7200 * count;
			}
		} else {
			JOptionPane.showMessageDialog(null, "메인 메뉴로 이동합니다..");
			cCheck=true;
		}
		if (p_check) {
			JOptionPane.showMessageDialog(null, "구입하셨습니다.");
		}

	
		return cCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 주문 상품; 메뉴? 수량 ? 가격
		// 구매하기 : 카드? 현금?
		String msg = "안녕하세요~! 버거킹입니다.\n";
		String menu = "①Burger 단품\n " + "②주문 상품\n" + "③구매하기\n" + "④종료하기\n";
		String order_b = "①아보카도 버거 \n②머쉬롬 버거 \n③임팩트 버거 \n④스파이시 버거\n";
		int money = 100000000;
		String pay = "①카드 ②현금";
		Bugger b = new Bugger();
		while (true) {
			int check = Integer.parseInt(JOptionPane.showInputDialog(msg + menu));
			if (check == 4) {
				break;
			}
			if (!(check >= 1 && check <= 4)) {
				continue;
			}

			switch (check) {
			case 1:
				if(b.checkin()) {
					continue;
				};

				break;
			case 2:

				break;
			case 3:
				check= Integer.parseInt(JOptionPane.showInputDialog(pay));
				if(check==1) {
					JOptionPane.showMessageDialog(null, "카드를 카드 단말기에 넣어주십시오");
				}else if(check ==2) {
					
				}else {
					JOptionPane.showMessageDialog(null, "메인화면으로 이동하겠습니다.");
					continue;
				}
					if (money - b.price < 0) {
						JOptionPane.showMessageDialog(null, "금액이 부족합니다.");
						continue;
					} else {
						check = JOptionPane.showConfirmDialog(null, b.price + "원입니다.");
						money -= b.price;
						JOptionPane.showMessageDialog(null, "현재 잔액은 " + money + "입니다.");
						continue;
					}
					
				
				}
			break;

			

		}

	}

};
