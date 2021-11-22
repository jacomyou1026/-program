package day28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String >set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("O");
		set.add("AB");
		set.add("AB");
		set.add("AB");
		set.add("AB");
		set.add("AB");
		System.out.println("총수 : "+set.size());
		System.out.println(set);
		//반복자 :Iterator : 반복해서 값을 순서대로 뽑을때 사용
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("AB");
		System.out.println(set.size());
		System.out.println(set);
		iter =set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
