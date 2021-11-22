package function;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import variable.Pet;

public class Manage {
	User u = new User();
	public static int insertCnt;
	String[] arData = new String[5];

	public void pms() {

		JPanel idPanel = new JPanel(new BorderLayout(50, 0));
		JPanel pwPanel = new JPanel(new BorderLayout(40, 0));
		JLabel idLabel = new JLabel("��ID");
		JLabel pwLabel = new JLabel("��PW");
		// �Է¹��� ���̵�
		JTextField id = new JTextField("���̵� �Է��ϼ���.");
		// �Է¹��� �н�����
		JPasswordField pw = new JPasswordField();

		String title = "�ֿϵ��� ���� ���α׷�(ȫ�浿)";
		String[] menu = { "LOGIN", "JOIN" };
		String[] userMenu = { "INSERT", "LIST", "SEARCH", "DELETE" };
		ImageIcon mainImg = new ImageIcon("./src/img/dog.gif");
		ImageIcon userImg = new ImageIcon("./src/img/user.gif");
		int choice = 0;
		String userChoice = null;

		idPanel.setOpaque(true);
		idPanel.setBackground(Color.WHITE);
		idPanel.add(idLabel, BorderLayout.WEST);
		idPanel.add(id);

		pwPanel.setOpaque(true);
		pwPanel.setBackground(Color.WHITE);
		pwPanel.add(pwLabel, BorderLayout.WEST);
		pwPanel.add(pw);

		idLabel.setFont(new Font("Arial", Font.BOLD, 18));
		pwLabel.setFont(new Font("Arial", Font.BOLD, 18));

		UIManager.put("OptionPane.okButtonText", "OK");
		UIManager.put("OptionPane.cancelButtonText", "LOGOUT");
		UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 18));
		UIManager.put("OptionPane.background", Color.white);
		UIManager.put("Panel.background", Color.white);

		while (true) {
			choice = JOptionPane.showOptionDialog(null, new Object[] { mainImg, idPanel, pwPanel }, title,
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, null);

			String password = "";
			for (int i = 0; i < pw.getPassword().length; i++) {
				password += pw.getPassword()[i];
			}

			Pet.setId(id.getText());
			Pet.setPw(password);

			if (choice == -1) {
				System.out.println("������");
				break;
			}
			switch (choice) {
			case 0:
				// �α���
				// ���������
				if (u.login(id.getText(), password)) {
					while (true) {
						userChoice = "" + JOptionPane.showInputDialog(null, "", title, JOptionPane.PLAIN_MESSAGE,
								userImg, userMenu, null);
						if (userChoice.intern() == "INSERT") {
							arData = JOptionPane
									.showInputDialog(null, "����, �ֿϵ����̸�, �����̸�, ����" + "\n ������� �Է��ϼ���", "������,�Ǻ�,�ѵ���,3,��")
									.split(",");
							insert();
						} else if (userChoice.intern() == "DELETE") {
							String num = JOptionPane.showInputDialog("������ ��ȣ�� �Է��ϼ���!");
							delete(num);

						} else if (userChoice.intern() == "SEARCH") {
							String keyword =  JOptionPane.showInputDialog("�˻��Ͻ� ������ ������ �Է��ϼ���!");
							JOptionPane.showMessageDialog(null, search(keyword));
						} else if (userChoice.intern() == "LIST") {
							JOptionPane.showMessageDialog(null, list());
						} else {
							break;
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				}
				break;

			case 1:
				// ȸ������
				if (u.join()) {
					JOptionPane.showMessageDialog(null, "ȸ������ �Ϸ�", title, JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "�ߺ��� ���̵� �Դϴ�.", title, JOptionPane.INFORMATION_MESSAGE);

				}
				break;
			}
		}
	}

	public void insert() {
		insertCnt++;
		Pet.getArList().get(User.rowNum).add(insertCnt + ".");
		for (int i = 0; i < arData.length; i++) {
			Pet.getArList().get(User.rowNum).add(arData[i]);
		}
		System.out.println(Pet.getArList());
	}

	void delete(String num) {
		int idx = Pet.getArList().get(User.rowNum).indexOf(num + ".");
		if (idx != -1) {
			for (int i =  0; i < arData.length +1; i++) {
				Pet.getArList().get(User.rowNum).remove(idx);
			}
		} else {
			JOptionPane.showMessageDialog(null, "����");
		}
	}

	public String search(String keyword) {
		// �˻��Ͻ� ������ ������ �Է��ϼ���
		String result = "����";
		for (int i = 3; i < Pet.getArList().get(User.rowNum).size(); i += 6) {
			if (Pet.getArList().get(User.rowNum).get(i).equals(keyword)) {
				if(result.equals("����") ){
					result="";
				}
				for (int j = -1; j < 5; j++) {
					result += Pet.getArList().get(User.rowNum).get(i + j)+"��";
				}
				result+="\n";
			}
		}
		return result;
	}

	public String list() {
		String list = "[" + Pet.getId() + "]";
		for (int i = 2; i < Pet.getArList().get(User.rowNum).size(); i++) {
			if ((8 - i) % 6 == 0) {
				list += "\n";
			}
			list += Pet.getArList().get(User.rowNum).get(i) + "��";
		}

		if (list.length() == Pet.getId().length() + 2) {
			list = "����";
		}
		return list;
	}
}
