public class Car{
	private static Scanner sc = new Scanner(System.in);
	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;
		
	
	public Car(){
		this("Opel", "Astra", 2017, "red", 1000000.0, false, 0.0);
	}
	
	public Car(String brand, String model, int year){
		this(brand, model, year, "red", 1000000.0, false, 0.0);
	}
	
	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage){
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
	}
	
	public String displayInfo(){
		return brand + "\n" + model + "\n" + year + "\n" + color + "\n" + price + "\n" + isRunning + "\n" + mileage;
	}
	
	public void startEngine(){
		isRunning = true;
	}
	
	public void stopEngine(){
		isRunning = false;
	}
	
	public void drive(double distance){
		mileage = mileage + distance;
	}
	
	public void repaint(String newColor){
		color = newColor;
	}
	
	public void updatePrice(double newPrice){
		price = newPrice;
	}
}
