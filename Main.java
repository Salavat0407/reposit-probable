public class Main{
	public static void main(String[] args){
		Dog dog1 = new Dog("Bobik", 3 , "Shavka");
		Fish fish1 = new Fish("Dori", 1, "yellow");
		Duck duck1 = new Duck("Donald", 2, "Kazan");
		Animal[] zoo = {
			dog1,
			fish1,
			duck1
		};
		for (Animal a : zoo){
			a.makeSound();
			System.out.println();
			a.sleep();
			System.out.println();
			if (a instanceof Swimmable){
				Swimmable s = (Swimmable) a;
				s.swim();
			}
			System.out.println();
			if (a instanceof Runnable){
				Runnable r = (Runnable) a;
				r.run();
			}
		}
		
		for (Animal b : zoo){
			if (b instanceof Dog){
				Dog d = (Dog) b;
				d.getMaxSpeed();
			}
		}
	}
}
