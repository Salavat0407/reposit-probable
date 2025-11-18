import java.util.Scanner;
public class Vehicle{
	private String brand;
	private int maxSpeed;
	Scanner sc = new Scanner(System.in);
	
	public Vehicle(String brand, int maxSpeed){
		setBrand(brand);
		setMaxSpeed(maxSpeed);
	}
	
	public String getBrand(){
		return brand;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public void setBrand(String brand){
		while ((brand == null) || (brand == "")){
			System.out.println("Введите бренд");
			brand = sc.nextLine();
		}
		this.brand = brand;
	}
	
	public void setMaxSpeed(int maxSpeed){
		while (maxSpeed<=0){
			System.out.println("Введите максимальную скорость");
			maxSpeed = sc.nextInt();
		}
		this.maxSpeed = maxSpeed;
	}
	
	public void move(){
		System.out.println(getBrand() + " движется ");
	}
	
	public void stop(){
		System.out.println(getBrand() + " останавливается ");
	}
	
	public void displayInfo(){
		System.out.println("Марка т/с: " + getBrand());
		System.out.println("Максимальная скорость т/с: " + getMaxSpeed());
	}
}
