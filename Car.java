import java.util.Scanner;
public class Car extends Vehicle{
	private String fuelType;
	Scanner sc = new Scanner(System.in);
	
	public Car(String brand, int maxSpeed, String fuelType){
		super(brand,maxSpeed);
		setFuelType(fuelType);
	}
	
	public String getFuelType(){
		return fuelType;
	}
	
	public void setFuelType(String fuelType){
		while (fuelType == null || fuelType == ""){
			System.out.println("Введите тип топлива");
			fuelType = sc.nextLine();
		}
		this.fuelType = fuelType;
	}
	
	public void refuel(){
		System.out.println("Идет заправка нафек...");
	}
	
	@Override
	public void move(){
		System.out.println(getBrand() + " едет по дороге нафек...");
	}
}
