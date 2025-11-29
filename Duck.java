public class Duck extends Animal implements Swimmable, Runnable{
	private String mestopol;
	
	public Duck(String name, int age, String mestopol){
		super(name, age);
		this.mestopol = mestopol;
	}
	
	@Override
	public void makeSound(){
		System.out.println("Кря кря");
	}
	@Override
	public void swim(){
		System.out.println("Утка плывет");
	}
	
	@Override
	public void run(){
		System.out.println("Утка бежит");
	}
	
}	
