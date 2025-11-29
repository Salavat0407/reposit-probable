public class Dog extends Animal implements Runnable{ //по умолчанию используем родителя
	private String breed;
	public Dog(String name, int age, String breed){
		super(name, age);
		this.breed = breed;
	}
	@Override
	public void makeSound(){
		System.out.println("Гав-гав");
	}
	@Override
	public void run(){
		System.out.println("Собачка бежит");
	}

}
