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
		JLabel idLabel = new JLabel("♥ID");
		JLabel pwLabel = new JLabel("♥PW");
		// 입력받은 아이디
		JTextField id = new JTextField("아이디를 입력하세요.");
		// 입력받은 패스워드
		JPasswordField pw = new JPasswordField();

		String title = "애완동물 관리 프로그램(홍길동)";
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
				System.out.println("나가기");
				break;
			}
			switch (choice) {
			case 0:
				// 로그인
				// 수정만들기
				if (u.login(id.getText(), password)) {
					while (true) {
						userChoice = "" + JOptionPane.showInputDialog(null, "", title, JOptionPane.PLAIN_MESSAGE,
								userImg, userMenu, null);
						if (userChoice.intern() == "INSERT") {
							arData = JOptionPane
									.showInputDialog(null, "종류, 애완동물이름, 주인이름, 성별" + "\n 순서대로 입력하세요", "강아지,뽀비,한동석,3,남")
									.split(",");
							insert();
						} else if (userChoice.intern() == "DELETE") {
							String num = JOptionPane.showInputDialog("삭제할 번호를 입력하세요!");
							delete(num);

						} else if (userChoice.intern() == "SEARCH") {
							String keyword =  JOptionPane.showInputDialog("검색하실 동물의 종류를 입력하세요!");
							JOptionPane.showMessageDialog(null, search(keyword));
						} else if (userChoice.intern() == "LIST") {
							JOptionPane.showMessageDialog(null, list());
						} else {
							break;
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요.");
				}
				break;

			case 1:
				// 회원가입
				if (u.join()) {
					JOptionPane.showMessageDialog(null, "회원가입 완료", title, JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "중복된 아이디 입니다.", title, JOptionPane.INFORMATION_MESSAGE);

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
			JOptionPane.showMessageDialog(null, "없음");
		}
	}

	public String search(String keyword) {
		// 검색하실 동물의 종류를 입력하세요
		String result = "없음";
		for (int i = 3; i < Pet.getArList().get(User.rowNum).size(); i += 6) {
			if (Pet.getArList().get(User.rowNum).get(i).equals(keyword)) {
				if(result.equals("없음") ){
					result="";
				}
				for (int j = -1; j < 5; j++) {
					result += Pet.getArList().get(User.rowNum).get(i + j)+"★";
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
			list += Pet.getArList().get(User.rowNum).get(i) + "★";
		}

		if (list.length() == Pet.getId().length() + 2) {
			list = "없음";
		}
		return list;
	}
}
