package day35;

public class TimeCheck {
	public static void main(String[] args)  {
		long start = System.currentTimeMillis();
		long end = 0L;
		
		int ar[]= new int[10000000];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=i;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end=System.currentTimeMillis();
		System.out.println((end-start)/1000.0+"ÃÊ");
		
	}
}
