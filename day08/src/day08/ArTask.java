package day08;

public class ArTask {
	public static void main(String[] args) {
		//�迭 ���� �� 1~5������ �� �ֱ�(for�� ���)
		int ar[] = new int[5];
		System.out.println("�迭 ���� �� 1~5������ �� �ֱ�(for�� ���)");
		for(int i=0;i<ar.length;i++) {
			ar[i]=i+1;
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		int sum=0;
		int count=0;
		//10~1������ �� �ֱ�(for�� ���)
		int ar2[] = new int[10];
		System.out.println("10~1������ �� �ֱ�(for�� ���)");
		/*
		 * for(int i=ar2.length;i>0;i--) { ar2[ar2.length-i]=i+1; sum+=ar2[i]; count++;
		 * } for(int i=0;i<ar2.length;i++) { System.out.print(ar2[i]+", "); }
		 */
		System.out.println();
		System.out.print("sum: "+sum);
		System.out.print("count: "+count);
		
	}
}
