package day08;

public class ArTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arDate = new int[4];
		 int arData[]= {1,2,3,4,5};
		 System.out.println(arDate);
		 arDate[0]=10;
		 System.out.println("arDate 길이");
		 for(int i=0;i<arData.length;i++) {
			 if(arData[i]==3) {
				 System.out.print("콜라가 있습니다.");					 
			 }
		 }
		 
	}

}
