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
		int count = 0; // ����
		int age = 0;
		count = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��ϼ���!"));
		if (check == 1) {
		price = 7200 * count;
		} else if (check == 2) {
			price = 3300 * count;
		} else if (check == 3) {
			price = 2200 * count;
		} else if (check == 4) {
			age = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��� �ּ���"));
			if (age < 8) {
				p_check = false;
				check = JOptionPane.showConfirmDialog(null, "8�� �̸��� �ſ� �� �ֽ��ϴ�.", "Warming",
						JOptionPane.WARNING_MESSAGE);

			} else {
				price = 7200 * count;
			}
		} else {
			JOptionPane.showMessageDialog(null, "���� �޴��� �̵��մϴ�..");
			cCheck=true;
		}
		if (p_check) {
			JOptionPane.showMessageDialog(null, "�����ϼ̽��ϴ�.");
		}

	
		return cCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// �ֹ� ��ǰ; �޴�? ���� ? ����
		// �����ϱ� : ī��? ����?
		String msg = "�ȳ��ϼ���~! ����ŷ�Դϴ�.\n";
		String menu = "��Burger ��ǰ\n " + "���ֹ� ��ǰ\n" + "�鱸���ϱ�\n" + "�������ϱ�\n";
		String order_b = "��ƺ�ī�� ���� \n��ӽ��� ���� \n������Ʈ ���� \n�꽺���̽� ����\n";
		int money = 100000000;
		String pay = "��ī�� ������";
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
					JOptionPane.showMessageDialog(null, "ī�带 ī�� �ܸ��⿡ �־��ֽʽÿ�");
				}else if(check ==2) {
					
				}else {
					JOptionPane.showMessageDialog(null, "����ȭ������ �̵��ϰڽ��ϴ�.");
					continue;
				}
					if (money - b.price < 0) {
						JOptionPane.showMessageDialog(null, "�ݾ��� �����մϴ�.");
						continue;
					} else {
						check = JOptionPane.showConfirmDialog(null, b.price + "���Դϴ�.");
						money -= b.price;
						JOptionPane.showMessageDialog(null, "���� �ܾ��� " + money + "�Դϴ�.");
						continue;
					}
					
				
				}
			break;

			

		}

	}

};
