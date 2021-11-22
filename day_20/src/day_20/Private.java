package day_20;

public class Private implements Soldier{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("천천히 각을 재서 90도로 앉아서 먹는다.");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("아주 열심히 일하지만 결과물이 없다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("남은 일이 많아서 꿈에서 논다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		play();
		System.out.println("잠을 들지 못한다.");
	}

	@Override
	public void salute() {
		// TODO Auto-generated method stub
		System.out.println("충!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!성");
	}
	
}
