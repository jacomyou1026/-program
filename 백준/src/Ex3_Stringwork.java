import java.util.Scanner;

public class Ex3_Stringwork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			int n = str.indexOf("@");
			if(n<6||n>10) {
				System.out.println("�߸��� ����");
				break;
				}else {
					System.out.println(str.substring(0,n)+"�� �α��� ����");
					break;
				}
			}
		}

	}

