package day24;

import java.util.Date;

/**
 * This one is Calculator.
 * 
 * @author ÀüÀ¯Áø
 * @since 2019.09.12
 *
 */

public class Calc {
	/**
	 * Divede num1 by num2<br>
	 * For example<br>
	 * You can see a Message "Div by zero"<br>
	 * if you give num2 zero<br>
	 * 
	 * For example
	 * dived(4,1) return 4
	 * dived(10,0) : " Divide bt zero"
	 * @param num1 : First Integer for divde
	 * @param num2 : Last Integer for divde
	 * @return void
	 */
	public static void divde(int num1 ,int num2) {
		try {
			System.out.println(num1/num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Div by zero");
		}
	}
	public static void main(String[] args) {
		Calc.divde(4, 0);
	}
}
