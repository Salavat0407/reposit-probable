public class SmartHome{
	private String homeName;
	SmartThermostat device1 = new SmartThermostat("001", "Termoprust 001", "кухня", true, 89.8, 12.6, 100.0, "охлаждение");
	SmartLight device2 = new SmartLight("002", "Lightybon 007", "гостинная", true, 89.8, 100, "синий" , true);
	SmartSecurityCamera device3 = new SmartSecurityCamera("003", "Зырик 889", "прихожая", true, 89.8, true, false, "1080p");
	SmartDevice[] devices = {
			device1,
			device2,
			device3
	};
	
	public void addDevice(SmartDevice device){
		SmartDevice[] devices_new = new SmartDevice[devices.length+1];
		devices_new[devices_new.length] = device;
		System.out.println("Добавлено новое устройство");
	}
	
	public void removeDevice(String deviceId){
		SmartDevice[] devices_new2 = new SmartDevice[devices.length-1];
		for (int i = 0; i < devices_new2.length; i++){
			
		}
					
	}
	
	public void turnOnAllDevices(){
		isPoweredOn = true;
	}
	
	public void turnOffAllDevices(){
		isPoweredOn = false;
	}
	
	public void getDevicesByType(String type){
		for (int i = 0; i < devices.length; i++){
			if (devices[i].getDeviceType() == type){
				System.out.println(devices[i])
			}
		}
	}
	
	public void calculateTotalPowerConsumption(){
		System.out.println(devices[i].getPowerConsumption());
	}
	
	public void getDeviceStatus(String deviceId){
		for (int i = 0; i < devices.length; i++){
			if (devices[i].getDeviceId() == deviceId){
				System.out.println(device[i].getStatus());
			}
		}
	}
}
