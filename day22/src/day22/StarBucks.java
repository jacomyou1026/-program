package day22;

import java.awt.Choice;
import java.util.Scanner;

public class StarBucks {
	private String[] menu = { "�Ƹ޸�ī��", "����Ƽ", "īǪġ��" };
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
		System.out.println("ī�� ��� �Ϸ�");
		System.out.println("-----Menu-----");

		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i + 1 + c.getMenu()[i]);
		}
		this.choice= choice; 
		c.sell(choice);
		
	}

	public static void main(String[] args) {
		StarBucks gangnam = new StarBucks();
		//�͸� Ŭ����
		gangnam.registCafe("����Ƽ",new Cafe() {
			
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
		System.out.println(gangnam.choice+" �ֹ� �Ϸ�");
		System.out.println("������� : "+gangnam.getIncome());
	}
}
