package maker;

public class User {
	public static void main(String[] args) {
		Phone2G p2 = new Phone2G();
		Phone3G p3 = new Phone3G();
		Phone4G p4 = new Phone4G();
		p2.turnOff();
		p2.call("�̹���");
		p2.msg("���ϴ�", "�̹���");
		p3.msg("�ȳ�", "�̹���");
		p3.call("�̹���");
		p3.useInternet();
		p2.turnOn();
	}
}
