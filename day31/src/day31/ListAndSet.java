package day31;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;


public class ListAndSet {
	public static void main(String[] args) {
		final int SIZE =10_000_000;
		final List<Integer> arrayList  =new ArrayList<Integer>(SIZE);
		final Set<Integer> hashSet = new HashSet<Integer>(SIZE);
		final int data = 9_000_000;
		
		//순차 병렬 집계연산
		IntStream.range(0, SIZE).forEach(value ->{
			arrayList.add(value);
			hashSet.add(value);
		});
		
		Instant start =Instant.now();
		arrayList.contains(data);
		Instant end =Instant.now();
		long time = Duration.between(start, end).toMillis();
		System.out.println("arrayList 검색 시간 : "+(time/1000.0)+"초");
		
		start =Instant.now();
		hashSet.contains(data);
		end =Instant.now();
		time = Duration.between(start, end).toMillis();
		System.out.println("Hashset 검색 시간 : "+(time/1000.0)+"초");
		
		
	}
	
}
