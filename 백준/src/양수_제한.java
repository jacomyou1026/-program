import java.util.Scanner;

public class ���_���� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int no;
		do {
			System.out.println("�Է�");
			no=sc.nextInt();
		}while(no<10||no>99);
		System.out.println(no);
	}
}
