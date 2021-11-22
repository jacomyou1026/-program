package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.IconView;

import java.util.Scanner;
import java.util.Set;

import dto.StudentVO;

public class ScoreDAO {
	// ������

	// ScoreDAo������ ����ϱ� private
	final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	private ArrayList<Integer> arScore = null;
	private LinkedHashMap<StudentVO, ArrayList<Integer>> smsMap = new LinkedHashMap<StudentVO, ArrayList<Integer>>();

	public void index() {
		// ���� view��
		int choice = 0;
		do {
			System.out.println("�л� ���� �ý���");
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("5. ������");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 5)
				break;

			switch (choice) {
			case 1:
				join();
				break;
			case 2:
				search();
				break;
			case 3:
				update();
				break;
			case 4:
				delet();
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
		} while (true);
	}

	public void join() {
		String isQuit = "";
		do {
			System.out.println("===========[�л����� �Է�(����q)]========");
			System.out.print("�̸� :");
			String name = sc.nextLine();
			System.out.println("���� :");
			int age = sc.nextInt();

			// ���� �Է� �� ���� ���
			sc.nextLine();
			StudentVO std = new StudentVO(name, age);
			arStudent = new ArrayList<StudentVO>();
			arScore = new ArrayList<Integer>();
			arStudent.add(std);
			System.out.println("���� ���� ���� ������ �Է��ϼ���\n ");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			smsMap.put(std, arScore);
			System.out.println("����?");

			// ���� �Է� �� ���� ���
			sc.nextLine();
			isQuit = sc.nextLine();
		} while (isQuit.intern() != "q");
		list(smsMap);
		System.out.println(smsMap);
	}

	public void list(LinkedHashMap<StudentVO, ArrayList<Integer>> db) {
		int size = smsMap.size();
		Set<Entry<StudentVO, ArrayList<Integer>>> set = db.entrySet();
		Iterator<Map.Entry<StudentVO, ArrayList<Integer>>> iter = set.iterator();
		if (size == 0) { 
			System.out.println("��ϵ� �л��� �����ϴ�.");
		} else {

			System.out.println("======[���Ը��]======");
			while (iter.hasNext()) {
				// HashMap :FILO
				Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
				temp.getKey().show();
				System.out.println("   ����   ����   ����");
				System.out.print("   ");
				for (int score : temp.getValue()) {
					System.out.print(score + "��   ");
				}
				System.out.println("\n");
			}
		}
	}

	public void search() {
		Set<StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();

		String name = null;
		System.out.println("�˻��� �л��� �̸�");
		name = sc.nextLine();

		System.out.println("=======[�˻� ���]=======");
		while (iter.hasNext()) {
			StudentVO std = iter.next();
			if (name.equals(std.getName())) {
				std.show();
				System.out.println("   ����   ����   ����");
				System.out.print("   ");
				for (int score : smsMap.get(std)) {
					System.out.print(score + "��   ");
				}
				System.out.println("\n");
			}
		}
	}

	public void update() {
		list(smsMap);
		int num = 0, choice = 0;
		boolean isUser =false;
		System.out.println("������ �л��� ��ȣ: ");
		num = sc.nextInt();
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		while (iter.hasNext()) {
			StudentVO std = iter.next();
			if (num == std.getNumber()) {
				isUser =true;
				System.out.println("1.��������\n2.��������");
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.println("�̸��� ���̸� ������� �Է��ϼ���!");
					std.setName(sc.next());
					std.setAge(Integer.parseInt(sc.next()));
					sc.nextLine();
					System.out.println("���� �Ϸ�");
					break;

				case 2:
					System.out.println("1.���� 2. ���� 3. ���� ?");
					choice =sc.nextInt();
					System.out.println("�� ������ �Է��ϼ���!");
					switch(choice) {
					case 1:
						smsMap.get(std).set(0, sc.nextInt());
						break;
					case 2:
						smsMap.get(std).set(1, sc.nextInt());
						break;
					case 3:
						smsMap.get(std).set(2, sc.nextInt());
						break;
					
					}
					sc.nextLine();
					System.out.println("���� �Ϸ�");
					break;
				default:
					isUser=false;
					System.out.println("���� ����");
				}
			} 
		}
		if(!isUser){
			System.out.println("������ �л��� �������� �ʽ��ϴ�.");
		}
		list(smsMap);
	}

	public void delet() {

		int number = 0;
		StudentVO delStd = null;
		System.out.println("���� ��ȣ�� �Է��ϼ���!");
		number = sc.nextInt();
		sc.nextLine();
		Iterator<StudentVO> iter = smsMap.keySet().iterator();

		System.out.println("=======[�˻� ���]========");
		while (iter.hasNext()) {
			StudentVO std = iter.next();
			if (number == std.getNumber()) {
				delStd = std;
				System.out.println(std.getName() + "�� �����Ǿ����ϴ�.");
			}
		}
		
		if (delStd == null) {
			System.out.println("�Է��Ͻ� ��ȣ�� �л��� �����ϴ�.");
		}
		smsMap.remove(delStd);
		list(smsMap);
	}
}
