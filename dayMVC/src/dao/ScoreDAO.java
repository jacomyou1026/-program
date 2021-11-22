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
	// 국영수

	// ScoreDAo에서만 사용하기 private
	final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	private ArrayList<Integer> arScore = null;
	private LinkedHashMap<StudentVO, ArrayList<Integer>> smsMap = new LinkedHashMap<StudentVO, ArrayList<Integer>>();

	public void index() {
		// 메인 view단
		int choice = 0;
		do {
			System.out.println("학생 관리 시스템");
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 나가기");
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
				System.out.println("잘못 입력 하셨습니다.");
			}
		} while (true);
	}

	public void join() {
		String isQuit = "";
		do {
			System.out.println("===========[학생정보 입력(종료q)]========");
			System.out.print("이름 :");
			String name = sc.nextLine();
			System.out.println("나이 :");
			int age = sc.nextInt();

			// 나이 입력 후 엔터 상쇄
			sc.nextLine();
			StudentVO std = new StudentVO(name, age);
			arStudent = new ArrayList<StudentVO>();
			arScore = new ArrayList<Integer>();
			arStudent.add(std);
			System.out.println("국어 영어 수학 점수를 입력하세요\n ");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			smsMap.put(std, arScore);
			System.out.println("종료?");

			// 점수 입력 후 엔터 상쇄
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
			System.out.println("등록된 학생이 없습니다.");
		} else {

			System.out.println("======[가입목록]======");
			while (iter.hasNext()) {
				// HashMap :FILO
				Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
				temp.getKey().show();
				System.out.println("   국어   영어   수학");
				System.out.print("   ");
				for (int score : temp.getValue()) {
					System.out.print(score + "점   ");
				}
				System.out.println("\n");
			}
		}
	}

	public void search() {
		Set<StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();

		String name = null;
		System.out.println("검색할 학생의 이름");
		name = sc.nextLine();

		System.out.println("=======[검색 결과]=======");
		while (iter.hasNext()) {
			StudentVO std = iter.next();
			if (name.equals(std.getName())) {
				std.show();
				System.out.println("   국어   영어   수학");
				System.out.print("   ");
				for (int score : smsMap.get(std)) {
					System.out.print(score + "점   ");
				}
				System.out.println("\n");
			}
		}
	}

	public void update() {
		list(smsMap);
		int num = 0, choice = 0;
		boolean isUser =false;
		System.out.println("수정할 학생의 번호: ");
		num = sc.nextInt();
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		while (iter.hasNext()) {
			StudentVO std = iter.next();
			if (num == std.getNumber()) {
				isUser =true;
				System.out.println("1.정보수정\n2.점수수정");
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.println("이름과 나이를 순서대로 입력하세요!");
					std.setName(sc.next());
					std.setAge(Integer.parseInt(sc.next()));
					sc.nextLine();
					System.out.println("수정 완료");
					break;

				case 2:
					System.out.println("1.국어 2. 영어 3. 수학 ?");
					choice =sc.nextInt();
					System.out.println("의 점수를 입력하세요!");
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
					System.out.println("수정 완료");
					break;
				default:
					isUser=false;
					System.out.println("수정 실패");
				}
			} 
		}
		if(!isUser){
			System.out.println("수정할 학생이 존재하지 않습니다.");
		}
		list(smsMap);
	}

	public void delet() {

		int number = 0;
		StudentVO delStd = null;
		System.out.println("지울 번호를 입력하세요!");
		number = sc.nextInt();
		sc.nextLine();
		Iterator<StudentVO> iter = smsMap.keySet().iterator();

		System.out.println("=======[검색 결과]========");
		while (iter.hasNext()) {
			StudentVO std = iter.next();
			if (number == std.getNumber()) {
				delStd = std;
				System.out.println(std.getName() + "이 삭제되었습니다.");
			}
		}
		
		if (delStd == null) {
			System.out.println("입력하신 번호의 학생이 없습니다.");
		}
		smsMap.remove(delStd);
		list(smsMap);
	}
}
