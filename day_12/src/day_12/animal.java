package day_12;
//강아지,고양이,돼지
//생성자를 사용해서 초기화
//생성자 단축키 : Alt_Shift+s >o
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
		System.out.println(name+"에게 "+feed+"을(를) 주다.");
	}
	void weight() {
		System.out.println(name+"'s weight : "+weight);
	}
	void showInfo() {
		System.out.println(name+"의 소리 : "+speek+" 다리 : "+leg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	public animal(String speek, int leg, String name, String feed, int weight)
		animal dog = new animal("멍멍",4,"dog","개껌",24);
		animal pig = new animal("꿀꿀",4,"pig","당근",24);
		animal cat = new animal("야옹",4,"cat","생선",23);
		dog.feed();
		cat.feed();
		pig.feed();
		dog.showInfo();
		cat.showInfo();
		pig.showInfo();
		
	}	

}
