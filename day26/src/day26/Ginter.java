package day26;

public interface Ginter<N1,N2> {
	abstract N1 add(N1 data1,N1 data2);
	N1 sub(N1 data1, N2 data2);
	N1 mul(N2 data1, N1 data2);
	
}
