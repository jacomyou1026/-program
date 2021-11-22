package day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class MapTest {
	public static void main(String[] args) {
	//����
		HashMap<String, Integer> fruitMap = new HashMap<String, Integer>();
		Collection<Integer> price = null;
		ArrayList<Integer> arPrice =new ArrayList<>();
		
		fruitMap.put("���", 1000);
		fruitMap.put("��", 2000);
		fruitMap.put("�ڵ�", 3000);
		fruitMap.put("����", 4000);
		
		System.out.println(fruitMap.get("�ڵ�")+"��");
		System.out.println(fruitMap.values());
		price = fruitMap.values();
		
		for(int i : price) {
			System.out.println(i+"��");
		}
		
		price.forEach(data->arPrice.add(data));
		System.out.println(arPrice);
		int total =0;
		double avg = 0.0;
		Set<Entry<String,Integer>> set = fruitMap.entrySet();
		System.out.println(set+"m");
		Iterator<Entry<String,Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = iter.next();
			System.out.println("���� �̸� : "+e.getKey()+", ���� : "+e.getValue());
			total +=e.getValue();
		}
		avg = Double.parseDouble(String.format("%.2f", (double)total/fruitMap.size()));
		System.out.println("��հ���: "+avg+"��");
		
	}
}
