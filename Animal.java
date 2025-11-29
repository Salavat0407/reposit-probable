public abstract class Animal{
	private String name;
	private int age;
	
	public Animal(String name, int age){
		setName(name);
		setAge(age);
	}
	
	public Animal(){
		this("name" , 0);
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean setName(String name){
		if (name == null || name.isEmpty()){
			System.out.println("Иди нафик");
			return false;
		}
		this.name = name;
		return true;
	}
	
	public boolean setAge(int age){
		if (age < 0){
			System.out.println("БЕ БЕ БЕ");
			return false;
		} 
		this.age = age;
		return true;
	}
	
	
	public void eat(){
		System.out.println(getName() + "кушает...");
	}
	
	public void sleep(){
		System.out.println(getName() + " спит...");
	}
	
	public abstract void makeSound();
	
}
