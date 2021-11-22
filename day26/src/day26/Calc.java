package day26;

public class Calc implements Ginter<Double,Integer> {

	@Override
	public Double add(Double data1, Double data2) {
		
		return data1+data2;
	}

	@Override
	public Double sub(Double data1, Integer data2) {
		// TODO Auto-generated method stub
		return data1-data2;
	}

	@Override
	public Double mul(Integer data1, Double data2) {
		// TODO Auto-generated method stub
		return data1*data2;
	}
	public static void main(String[] args) {
		Calc c =new Calc();
		System.out.printf("%.2f\n",c.add(2.3, 24.3));
		System.out.printf("%.2f\n",c.sub(2.3, 24));
		System.out.printf("%.2f",c.mul(2, 24.3));
	}
}
