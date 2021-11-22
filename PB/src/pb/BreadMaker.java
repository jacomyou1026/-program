package pb;

public class BreadMaker extends Thread{
	private BreadPlate bread = null;
	
	public BreadMaker() {
		
	}
	 
	public BreadMaker(BreadPlate bread) {
		setBread(bread);
	}
	
	public BreadPlate getBread() {
		return bread;
	}

	public void setBread(BreadPlate bread) {
		this.bread = bread;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			bread.makeBread();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("»§ÀÌ ´Ù ¶³¾îÁ³¾î¿ä");
	}
	
}
