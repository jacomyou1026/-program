package maker;
/*
 * phone 인퍼페이스(추상클래스) 내에서 모든 폰이 사용하는 기능
 *  phone2G, phone 3G, phone4G를 구현한다.
 *  User 클래쓰 3가지 전부 사용하기 
 */
public interface Phone {
	void msg(String msg,String tel);
	void call(String tell);
	void useInternet() ;
}
