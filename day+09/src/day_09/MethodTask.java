package day_09;

class MethodTask {
/*
 * Ȧ���� ¦����, ¦��->Ȧ�� �ٲ��ִ� �޼ҵ�
 * 1���� ����  �Է��� �������� ������ �����ִ� �޼���
 *�� ������ ������ �޼���
 *
 * ������ �ѱ۷� �ٲ��ִ� �޼���
 *�Է� �� )1012
 *��� �� �� �� �� ��
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
			System.out.println("1���� ū ���� �Է��ϼ���");
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
		//���ڿ��� ���ڹ迭�̱⿡ �迭 ����x
		String hangle="�����̻�����ĥ�ȱ�";
		int num = Integer.parseInt(data);
		//data�� ���ڿ�Ÿ��
		String result="";
		for (int i = 0; i < data.length(); i++) {
				result+= hangle.charAt(num%10);
				num/=10;
		}
		for(int i=data.length()-1;i>-1;i--) {
			System.out.print(result.charAt(i));
		}
		
	}
	public static void main(String[] args) {// static �� ���� ���� ����Ǳ⿡ 
																//static�� �޸𸮿� ��� �ö�� �ֱ⿡�� �޸𸮰� ������
		// TODO Auto-generated method stub
		MethodTask m = new MethodTask();
		m.swap(12);
		m.added(10);
		m.divde(10, 5);
		m.change_name("1434");
		
	}

}
