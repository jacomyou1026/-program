package day_09;

public class ArrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrData = new int[3][4];
		for(int i=1;i<10;i++) {
			System.out.println(i+"��");
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			String q ="still for you";
			System.out.println(q);
			System.out.println();
		}
	}

}
