package maker;

public class Phone2G extends AbPhone{

	public void msg(String msg, String tel) {
		System.out.println(tel+"이 "+msg+"를 보냈습니다.");
	}

	public void call(String tell) {
		System.out.println(tell+"이 전화를 합니다.");
		
	}


}
