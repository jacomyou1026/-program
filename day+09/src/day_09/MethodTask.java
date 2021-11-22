package day_09;

class MethodTask {
/*
 * 홀수를 짝수로, 짝수->홀수 바꿔주는 메소드
 * 1부터 내가  입력한 정수까지 누적합 구해주는 메서드
 *두 정수의 나눗셈 메서드
 *
 * 정수를 한글로 바꿔주는 메서드
 *입력 예 )1012
 *출력 예 일 공 이 사
 */
	int swap(int num){
		if(num%2==0) {
			num++;
		}
		else {
			num++;
		}
		return num;
	}
	
	void added(int end) {
		int sum=0;
		if(end>1) {			
			for(int i=1;i<=end;i++) {
				sum+=i;
			}
			System.out.println(sum);
		}else {
			System.out.println("1보다 큰 수를 입력하세요");
		}
	}
	
	void  divde(int num1,int num2) {
		double result = 0.0;
		if(num2 !=0) {
			result= Double.parseDouble(String.format("%.3f", (double)num1/num2));
			System.out.println(result);
		}else {
		}
	}
	
	void change_name(String data) {
		//문자열은 문자배열이기에 배열 접근x
		String hangle="공일이삼사오육칠팔구";
		int num = Integer.parseInt(data);
		//data는 문자열타입
		String result="";
		for (int i = 0; i < data.length(); i++) {
				result+= hangle.charAt(num%10);
				num/=10;
		}
		for(int i=data.length()-1;i>-1;i--) {
			System.out.print(result.charAt(i));
		}
		
	}
	public static void main(String[] args) {// static 이 가장 먼저 실행되기에 
																//static은 메모리에 계속 올라와 있기에ㅔ 메모리가 느려짐
		// TODO Auto-generated method stub
		MethodTask m = new MethodTask();
		m.swap(12);
		m.added(10);
		m.divde(10, 5);
		m.change_name("1434");
		
	}

}
