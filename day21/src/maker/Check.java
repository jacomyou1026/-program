package maker;

public class Check {
	public static void main(String[] args) {
		Digimon d =new Digimon();
		PokeMon p = new PokeMon();
		ZzangGu z = new ZzangGu();
		HerryPotter h = new HerryPotter();
		
		if(d instanceof Animation) {
			System.out.println("디지몬은 애니메이션 입니다.");
		}
		if(p instanceof Animation) {
			System.out.println("포케몬은 애니메이션 입니다.");
		}
		if(z instanceof Animation) {
			System.out.println("짱구은 애니메이션 입니다.");
		}
		if(!(h instanceof Animation)) {
			System.out.println("해리포터은 애니메이션이 아닙니다..");
		}
	}
}
