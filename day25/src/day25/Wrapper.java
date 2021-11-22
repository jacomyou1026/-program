package day25;

public class Wrapper {
	public static void main(String[] args) {
		//jdk 1.5버전 전에는 무조건 이렇게 사용
		String str1 = new String("1");
		String str= "1";//오토박싱
		Integer data = 10;//오토박싱
		int data2 = data; // 오토언박싱
		System.out.println(str);
	}
	
	
	
}
