package maker;

public class Check {
	public static void main(String[] args) {
		Digimon d =new Digimon();
		PokeMon p = new PokeMon();
		ZzangGu z = new ZzangGu();
		HerryPotter h = new HerryPotter();
		
		if(d instanceof Animation) {
			System.out.println("�������� �ִϸ��̼� �Դϴ�.");
		}
		if(p instanceof Animation) {
			System.out.println("���ɸ��� �ִϸ��̼� �Դϴ�.");
		}
		if(z instanceof Animation) {
			System.out.println("¯���� �ִϸ��̼� �Դϴ�.");
		}
		if(!(h instanceof Animation)) {
			System.out.println("�ظ������� �ִϸ��̼��� �ƴմϴ�..");
		}
	}
}
