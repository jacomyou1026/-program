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
		//indexOf():���� ������ �� ���� ����ִ� ���ȣ�� �ش�. ���� ������ -1�� �ش�.
		int idx = list.indexOf(10);
		if(idx!=-1) {
			list.add(idx+1,15);
		}else {
			list.add(0,15);
		}
		System.out.println(list);
		
		//�ǽ� 60�� 600���� �ٲٱ�
		int idx1 = list.indexOf(60);
		list.set(idx1,600);
		System.out.println(list);
		
		//���� 15�����!
		list.remove(new Integer(15));
		System.out.println(list);
		System.out.println(list.size());
		
		
	}
}

