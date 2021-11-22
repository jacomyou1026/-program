package day22;

import java.awt.Choice;
import java.util.Scanner;

public class StarBucks {
	private String[] menu = { "아메리카노", "레몬티", "카푸치노" };
	private int[] arPrice = { 4000, 8000, 9000 };
	private int income;
	String choice = null;

	public int[] getArPrice() {
		return arPrice;
	}

	public void setArPrice(int[] arPrice) {
		this.arPrice = arPrice;
	}

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public void registCafe(String choice,Cafe c) {
		c.setMenu(menu);
		System.out.println("카페 등록 완료");
		System.out.println("-----Menu-----");

		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i + 1 + c.getMenu()[i]);
		}
		this.choice= choice; 
		c.sell(choice);
		
	}

	public static void main(String[] args) {
		StarBucks gangnam = new StarBucks();
		//익명 클래스
		gangnam.registCafe("레몬티",new Cafe() {
			
			@Override
			public void setMenu(String[] menu) {
				gangnam.menu = menu;
			}
			
			@Override
			public void sell(String choice) {
				// TODO Auto-generated method stub
				for (int i = 0; i < gangnam.getMenu().length; i++) {
					if(gangnam.getMenu()[i].equals(choice)){
						gangnam.income+=gangnam.arPrice[i];
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return gangnam.menu;
			}
		});
		System.out.println(gangnam.choice+" 주문 완료");
		System.out.println("현재수익 : "+gangnam.getIncome());
	}
}
