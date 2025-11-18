import java.util.Scanner;
public class Motorcycle extends Vehicle{
	private double engineCapacity;
	Scanner sc = new Scanner(System.in);
	
	public Motorcycle(String brand, int maxSpeed, double engineCapacity){
		super(brand, maxSpeed);
		setEngineCapacity(engineCapacity);
	}
	
	public double getEngineCapacity(){
		return engineCapacity;
	}
	
	public void setEngineCapacity(double engineCapacity){
		while (engineCapacity<0){
			System.out.println("Введите объем двигателя");
			engineCapacity = sc.nextDouble();
		}
		this.engineCapacity = engineCapacity;
	}
	
	public void wheelie(){
		System.out.println(getBrand() + " делает вилли...");
	}
	
	@Override
	public void move(){
		System.out.println(getBrand() + " мчится по шоссе...");
	}
}
