import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		//Ű���忡�� ���� ���� ȸ�������� �Ǵ�
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
//		int center =str.length()/2;
//		String a = str.substring(0,center);
//		String b = str.substring(center+1,str.length());
		String n = "";
		for(int i=str.length()-1;i>=0;i--) {
			n+=str.charAt(i);
			
		}
		if(str.equals(n)) {
			System.out.println(str+"�� ȸ���� �Դϴ�.");
		}else {
			System.out.println(str+"�� ȸ������ �ƴմϴ�.");
		}
		

	}
}
