package maker;
/*
 * phone �������̽�(�߻�Ŭ����) ������ ��� ���� ����ϴ� ���
 *  phone2G, phone 3G, phone4G�� �����Ѵ�.
 *  User Ŭ���� 3���� ���� ����ϱ� 
 */
public interface Phone {
	void msg(String msg,String tel);
	void call(String tell);
	void useInternet() ;
}
