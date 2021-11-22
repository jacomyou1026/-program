package day27;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {		
		ArrayList<Integer> list =new ArrayList<>();
		//10~80
		for (int i = 1; i <9 ; i++) {
			list.add(i*10);
			
		}
		System.out.println(list);
		list.add(90);
		System.out.println(list);
		//indexOf():값이 있으면 그 값이 들어있는 방번호를 준다. 값이 없으면 -1을 준다.
		int idx = list.indexOf(10);
		if(idx!=-1) {
			list.add(idx+1,15);
		}else {
			list.add(0,15);
		}
		System.out.println(list);
		
		//실습 60을 600으로 바꾸기
		int idx1 = list.indexOf(60);
		list.set(idx1,600);
		System.out.println(list);
		
		//삭제 15지우기!
		list.remove(new Integer(15));
		System.out.println(list);
		System.out.println(list.size());
		
		
	}
}

