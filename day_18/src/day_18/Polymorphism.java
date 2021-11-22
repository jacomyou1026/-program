package day_18;

import java.util.Random;

class Avengers {
	public void fight() {
		System.out.println("Avengers Assenble");
	}
}

class IronMan extends Avengers {
	@Override
	public void fight() {
		System.out.println("Beam!!");
	}
}

class Thor extends Avengers {
	@Override
	public void fight() {
		System.out.println("Thunder from Hammer!");
	}
}

class Hulk extends Avengers {
	public void fight() {
		System.out.println("Big green monster");
	}
}

class CaptainAmerica extends Avengers {
	@Override
	public void fight() {
		System.out.println("Throw the Shield");
	}
}

class HawkEye extends Avengers {
	@Override
	public void fight() {
		System.out.println("Arrow Bomb!");
	}
}

class BlackWidow extends Avengers {
	@Override
	public void fight() {
		System.out.println("Kick and Punch!");
	}
}

class Loki extends Avengers{
	@Override
	public void fight() {
		System.out.println("Duplication");
	}
}

public class Polymorphism {
	public boolean whoAreYou(Avengers a) {
		boolean isLoki = false;
		if (a instanceof IronMan) {
			System.out.println("I am Ironman");
		} else if (a instanceof Thor) {
			System.out.println("I am Thor");
		} else if (a instanceof CaptainAmerica) {
			System.out.println("I am CaptainAmerica");
		} else if (a instanceof Hulk) {
			System.out.println("I am Hulk");
		} else if (a instanceof BlackWidow) {
			System.out.println("I am BlackWidow");
		} else if (a instanceof HawkEye) {
			System.out.println("I am HawkEye");
		}else if (a instanceof Loki) {
			isLoki = true;
			System.out.println("We found Loki!!");
		}
		else {
			System.out.println("Villain");
		}
			return  isLoki;
		
	}

	public static void main(String[] args) {
		Polymorphism p  =new Polymorphism();
		Random r =new Random();
		
		Avengers[] avengers = { 
				new IronMan(),
				new Thor(),
				new CaptainAmerica(),
				new HawkEye(),
				new BlackWidow(),
				new Loki()
		}; 
		for (int i = 0; i < 100; i++) {
			int index =r.nextInt(6);
			if(p.whoAreYou(avengers[index])) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
