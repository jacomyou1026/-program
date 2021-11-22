package day_09;

import java.util.Scanner;

public class ArTest {
/*
 * 1동
 * 1호 2호 3호
 * 
 */
	
	public static void main(String[] args) {
		int[] ho = new int[3];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg =0.0;
		for(int i=0;i<ho.length;i++) {
			System.out.println((i+1) +"호 월세를 입력하세요(단위 : 만원)");
			ho[i]=sc.nextInt();
			sum+=ho[i];
		}
		System.out.println("1동의 총 월세 : "+sum+"만원");
		
		//System.out.printf("1동의 총 월세 : %.2f만원",avg);
		avg =Double.parseDouble(String.format("%.2f", (double)sum/ho.length));
				
 	}
	

 }
