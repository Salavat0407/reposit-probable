public class Main{
	public static void main(String[] args){
		Vehicle vehicle1 = new Car("Opel", 220, "95");
		Vehicle[] garage = {
			vehicle1,
			new Bicycle("Stells", 40, 21),
			new Motorcycle("Kawasaki", 240, 1024.45)
		};
		
		for (int i = 0; i<garage.length; i++){
			garage[i].move();
		}
		
		for (int i = 0; i<garage.length; i++){
			if (garage[i] instanceof Car){
				Car car1 = (Car) garage[i];
				car1.refuel();
			}
		}
		
		for (int i = 0; i<garage.length; i++){
			if (garage[i] instanceof Bicycle){
				Bicycle bicycle1 = (Bicycle) garage[i];
				bicycle1.changeGear();
			}
		}
		
		for (int i = 0; i<garage.length; i++){
			if (garage[i] instanceof Motorcycle){
				Motorcycle motorcycle1 = (Motorcycle) garage[i];
				motorcycle1.wheelie();
			}
		}
	}
}
