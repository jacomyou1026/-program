package day_09;

public class MethodTest {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("none");
		} else {
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		}
	}
}
