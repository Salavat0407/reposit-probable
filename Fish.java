public class Fish extends Animal implements Swimmable{
	private String color;
	
	public Fish(String name, int age, String color){
		super(name, age);
		this.color = color;
	}
	
	@Override
	public void makeSound(){
		System.out.println("Буль буль");
	}
	@Override
	public void swim(){
		System.out.println("Рыбка плывет");
	}
	
}
