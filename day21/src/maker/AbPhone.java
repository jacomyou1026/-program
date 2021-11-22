package maker;

public abstract class AbPhone implements Phone {

	public void turnOn() {
		System.out.println("Àü¿ø ÄÑÁü");
	}
	public  void turnOff() {
		System.out.println("Àü¿ø ²¨Áü");
	}
	@Override
	public void msg(String msg, String tel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void call(String tell) {
		// TODO Auto-generated method stub

	}

	@Override
	public void useInternet() {
		// TODO Auto-generated method stub

	}

}
