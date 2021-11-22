package day35;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		Date d =new Date();
		Calendar c =Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		String dOfWeek[]= {"��","��","ȭ","��","��","��","��"};
		//Calendar Ŭ������ singleton�������� ����� Ŭ���� ��ü�� ����� ����� �� ����.
		//��ü�� ���� ����� �� ���� Ŭ������ ���ο� �ڽ��� Ŭ������ ���� ��ü�� �����ϰ� �ֱ� ������ 
		//Ŭ���� ������ ������ �ִ� �ڽ��� ��ü�� ������ �޼ҵ�� (getInstance())�� �ڽ��� ��ü��
		//�ڽ��� ��ü�� ���ͼ� ����ϴ�.
		
		//Singleton�������� �����ϴ� Ŭ������ ���α׷����� 
		//�� 1���� �ʿ��� ��ü�� singleton�������� �����Ѵ�.

		//Calendar�� Day_of_week�� �Ͽ���(1),������(2),��.,�����(7)�̴�.
		//Calendar�� �����Ǿ� �ִ� �Լ��� ���� ���� ���� 1�� ��������Ѵ�.(0���� ����)
		System.out.println(d);
		System.out.println(c);
		System.out.println(sdf.format(c.getTime()));
		System.out.println("��: "+c.get(Calendar.YEAR));
		System.out.println("��: "+(c.get(Calendar.MONTH)+1));
		System.out.println("��: "+c.get(Calendar.DATE));
		System.out.println("��: "+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("����: "+c.get(Calendar.DAY_OF_WEEK));//1���� �����ϱ⿡ 
		System.out.println("����: "+dOfWeek[c.get(Calendar.DAY_OF_WEEK)-1]+"����"); //1���� �����ϱ⿡ -1��
		System.out.println("��: "+c.get(Calendar.HOUR));//4��
		System.out.println("��: "+c.get(Calendar.HOUR_OF_DAY)); //16��
		System.out.println("��: "+c.get(Calendar.MINUTE)); 
		System.out.println("��: "+c.get(Calendar.SECOND)); 
		System.out.println("�и���: "+c.get(Calendar.MILLISECOND));
		
		//Date Ŭ������ 1900���� �������� ��¥�� ó���Ѵ�.
		//���� �������� 1900���� ���ؼ� ���;��ϰ�, �־��ַ��� 1900���� ���� �־���ϳ�.
		//���� �������� 1�� ���ؼ� ���;��ϰ�, �־��ַ��� 1�� ���� �־���Ѵ�.
		
		Scanner sc =new Scanner(System.in);
		System.out.println("�� �� ��: ");
		int year = sc.nextInt()-1900;
		int month=sc.nextInt()-1; //+1�� �� �ķ� �����⿡
		int day = sc.nextInt();
		
		Date date = new Date(year,month,day);
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
		System.out.println(sdf2.format(date));
		
	}
}
