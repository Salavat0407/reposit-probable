public class SmartThermostat extends SmartDevice{
	private double currentTemperature;
	private double targetTemperature;
	private String mode;
	
	public SmartThermostat(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, double currentTemperature, double targetTemperature, String mode){
		super(deviceId,deviceName,location, isPoweredOn, powerConsumption);
		setTemperature(currentTemperature);
		setTargetTemperature(targetTemperature);
		setMode(mode);
	}
	
	public double getTemperature(){
		return currentTemperature;
	}
	
	public double getTargetTemperature(){
		return targetTemperature;
	}
	
	public String getMode(){
		return mode;
	}
	
	public void setTemperature(double currentTemperature){
		this.currentTemperature = currentTemperature;
	}
	
	public void setTargetTemperature(double targetTemperature){
		this.targetTemperature = targetTemperature;
	}
	
	public void setMode(String mode){
		if (mode != null && !mode.isEmpty()){
			this.mode = mode;
		}
	}
	
	public void setTemperature(double currentTemperature, String mode){
		setTemperature(currentTemperature);
		setMode(mode);
	}
	
	@Override
	public String getDeviceType(){
		return "Умный термостат";
	}
	@Override
	public void performAction(){
		System.out.println("Регулирует температуру");
	}
	
	public void scheduleTemperature(double temp, int hour){
		System.out.println("Температура " + temp + " запланирована на " + hour + " часов");
	}
}
