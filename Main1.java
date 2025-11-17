public class Main{
	public static void main(String[] args){
		Animal animal1 = new Dog("Локи", 3, "Той-пудель");
		Animal[] zoo = {
			animal1,
			new Cat("Маркиза", 15, 0),
			new Bird("Птичка", 2, true),
			new Animal("Неизвестное животное", 0)
		};
		for (int i = 0; i<zoo.length; i++){
			if (zoo[i] instanceof Cat){
				Cat cat1 = (Cat) zoo[i];
				cat1.climbTree();
			} else if (zoo[i] instanceof Dog){
				Dog dog1 = (Dog) zoo[i];
				System.out.println(dog1.getBreed());
			}
		}
		
		for (int i = 0; i<zoo.length; i++){
			zoo[i].makeSound();
		}
		
		for (int i = 0; i<zoo.length; i++){
			if (zoo[i] instanceof Bird){
				Bird bird1 = (Bird) zoo[i];
				bird1.fly();
			}
		}
	}
}
