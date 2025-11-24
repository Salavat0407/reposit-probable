public class SmartLight extends SmartDevice{
	private int brightness; //яркость
	private String color; //цвет света
	private boolean isColorChanging; //поддерживает ли смену цвета
	
	public SmartLight(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, int brightness, String color, boolean isColorChanging){
		super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
		setBrightness(brightness);
		setBrightness(color);
		this.isColorChanging = isColorChanging;
	}
	
	public int getBrightness(){
		return brightness;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setBrightness(int level){
		if (level >= 0 && level <= 100){
			brightness = level;
		}		
	}
	
	public void setColor(String color){
		if (color != null && !color.isEmpty()){
			this.color = color;
		} 
	}
	
	public void setBrightness(int level, String color){
		setBrightness(level);
		setColor(color);
	}
		
	
	public void changeColor(String newColor){
		if (isColorChanging == true){
			setColor(newColor);
		}
	}
	
	public void dimLights(){
		setBrightness(0);
	}
	
	@Override
	public String getDeviceType(){
		return "Умная лампа";
	}
	
	@Override
	public void performAction(){
		if (getBrightness() == 0){
			System.out.println("Свет включен");
			setBrightness(100);
		} else if (getBrightness() == 100){
			System.out.println("Свет выключен");
			setBrightness(0);
		}
	}
	
}
