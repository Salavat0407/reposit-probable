public class MobilePhone{
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;
	
	public MobilePhone(){
		this("Iphone", "16 pro max", 128, 100, true);
	}
	
	public MobilePhone(String brand, String model, int storageGB){
		this(brand, model, storageGB, 100, true); 
	}
	
	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn){
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
	}
	public String displayInfo(){
		return brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
	}
	
	public void powerOn(){
		isPoweredOn = true;
	}
	
	public void powerOff(){
		isPoweredOn = false;
	}
	public void chargeBattery(int percent){
		while (batteryLevel<percent){
			batteryLevel++;
		}
	}
	public void useBattery(int percent){
		while (batteryLevel>percent){
			batteryLevel=batteryLevel-1;
		}
	}	
}
