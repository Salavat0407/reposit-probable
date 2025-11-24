public class SmartDevice{
	private String deviceId; //уникальный идентификатор устройства 
	private String deviceName; //название устройства
	private String location; //местоположение в доме 
	private boolean isPoweredOn; //статус включения устройства 
	private double powerConsumption; //потребление энергии в ваттах 
	private static int totalDevices; //счетчик созданных устройств 
	private final int MAX_POWER_CONSUMPTION = 5000;
	
	public SmartDevice(){
		this("NN00", "Noname", "location", false, 0.0);
	}
	
	public SmartDevice(String deviceId, String deviceName, String location){
		this(deviceId, deviceName, location, false, 0.0);
		
	}
	
	public SmartDevice(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption){
		setDeviceId(deviceId);
		setDeviceName(deviceName);
		setLocation(location);
		this.isPoweredOn = isPoweredOn;
		setPowerConsumption(powerConsumption);
		totalDevices++;
	}
	
	public static int getTotalDevices(){
		return totalDevices;
	}
	
	public String getDeviceType(){
		return "Неопределенный тип";
	}
	//геттер id
	public String getDeviceId(){
		return deviceId;
	}
	//геттер название
	public String getDeviceName(){
		return deviceName;
	}
	//геттер локация
	public String getLocation(){
		return location;
	}
	
	public boolean getStatus(){
		return isPoweredOn;
	}
	
	//геттер потребление
	public double getPowerConsumption(){
		return powerConsumption;
	}
	//сеттер id
	public void setDeviceId(String deviceId){
		if (deviceId != null && !deviceId.isEmpty()){
			this.deviceId = deviceId;
		}
	}
	//сеттер название
	public void setDeviceName(String deviceName){
		if (deviceName != null && !deviceName.isEmpty()){
			this.deviceName = deviceName;
		}
	}
	//сеттер локация
	public void setLocation(String location){
		if (location == null && !location.isEmpty()){
			this.location = location;
		} 
	}
	//сеттер локация
	public void setPowerConsumption(double powerConsumption){
		if (powerConsumption > 0.0 && powerConsumption < MAX_POWER_CONSUMPTION){
			this.powerConsumption = powerConsumption;
		} 
	}
	
	public void performAction(){
		System.out.println("Подгружается система...");
	}
	
	public void turnOn(){
		isPoweredOn = true;
	}
	
	public void turnOff(){
		isPoweredOn = false;
	}
}
