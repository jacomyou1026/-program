package day28;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;


public class WhySet {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer>arrayList = new ArrayList<>(SIZE);
		final Set<Integer> set =new HashSet<>(SIZE);
		final int data = 9_000_000;
		
		//순차 병렬 집계연산
		IntStream.range(0, SIZE).forEach(value->{
			arrayList.add(value);
			set.add(value);
		});
		
		//끝시간 - 시작시간 = 결린시간
		Instant strat = Instant.now();
		arrayList.contains(data);
		Instant end = Instant.now();
		long etime = Duration.between(strat, end).toMillis();
		System.out.println("array list search time :"+(etime/1000.0)+"초");
		
		strat= Instant.now();
		set.contains(data);
		end = Instant.now();
		etime = Duration.between(strat, end).toMillis();
		System.out.println("hash_set list search time :"+(etime/1000.0)+"초");
		
	}
}
