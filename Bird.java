public class Bird extends Animal{
	private boolean canFly;
	
	public Bird(String name, int age, boolean canFly){
		super(name,age);
		this.canFly = canFly;
	}
	
	public void fly(){
		if (canFly == true){
			System.out.println(getName() + " летает нафик");
		} else {
			System.out.println("Не умеет летать");
		}
	}
	
	@Override
	public void makeSound(){
		System.out.println("Чик - чирик!");
	}
}
