package day33;

public class ThreadAimal {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck =new Duck();
		Pig pig =new Pig();
		
		Thread t_cat=new Thread(cat);
		Thread t_dog=new Thread(dog);
		Thread t_duck=new Thread(duck);
		Thread t_pig=new Thread(pig);
		
		t_cat.start();
		t_dog.start();
		try {
			t_cat.join();
			t_dog.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t_duck.start();
		t_pig.start();
		
		
	}
	
			
}
