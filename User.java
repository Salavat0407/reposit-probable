public class User{
	String username;
	UserRole role;
	int age;
	
	public User(String username, UserRole role, int age){
		this.username = username;
		this.role= role;
		this.age = age;
	}
	
	public String getUserName(){
		return username;
	}
	
	public UserRole getRole(){
		return role;
	}
	
	public int getAge(){
		return age;
	}
	
	public void checkAge(){
		if (getAge() < 18){
			throw new IllegalArgumentException(" " + getUserName() + " нет 18 лет");
		}
	}
	
}
