package day_12;
//������,�����,����
//�����ڸ� ����ؼ� �ʱ�ȭ
//������ ����Ű : Alt_Shift+s >o
public class animal {
	String speek;
	int leg;
	String name;
	String feed;
	int weight;
	
	public animal(String speek, int leg, String name, String feed, int weight) {
		this.speek = speek;
		this.leg = leg;
		this.name = name;
		this.feed = feed;
		this.weight = weight;
	}
	animal(){
		
	}
	void feed() {
		System.out.println(name+"���� "+feed+"��(��) �ִ�.");
	}
	void weight() {
		System.out.println(name+"'s weight : "+weight);
	}
	void showInfo() {
		System.out.println(name+"�� �Ҹ� : "+speek+" �ٸ� : "+leg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	public animal(String speek, int leg, String name, String feed, int weight)
		animal dog = new animal("�۸�",4,"dog","����",24);
		animal pig = new animal("�ܲ�",4,"pig","���",24);
		animal cat = new animal("�߿�",4,"cat","����",23);
		dog.feed();
		cat.feed();
		pig.feed();
		dog.showInfo();
		cat.showInfo();
		pig.showInfo();
		
	}	

}
