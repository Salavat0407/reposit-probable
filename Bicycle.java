import java.util.Scanner;
public class Bicycle extends Vehicle{
	private int gearCount;
	Scanner sc = new Scanner(System.in);
	
	public Bicycle(String brand, int maxSpeed, int gearCount){
		super(brand,maxSpeed);
		setGearCount(gearCount);
	}
	
	
	public int getGearCount(){
		return gearCount;
	}
	
	public void setGearCount(int gearCount){
		while(gearCount < 0 || gearCount > 21){
			System.out.println("Введите количество скоростей");
			gearCount = sc.nextInt();
		}
		this.gearCount = gearCount;
	}
	
	public void changeGear(){
		System.out.println("Идет переключение скоростей...");
	}
	
	@Override
	public void move(){
		System.out.println(getBrand() + " едет по велодорожке...");
	}
}
