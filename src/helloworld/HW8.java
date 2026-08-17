package helloworld;

public class HW8 {
	interface Vehicle {
		public void start();
		public void stop();
	}
	interface FuelBased {
		public void refuel();
	}
	static class Car implements Vehicle,FuelBased{
		public void start() {
			System.out.println("Car engine started.");
		}
		public void stop() {
			System.out.println("Car engine stopped.");
		}
		public void refuel() {
			System.out.println("Car is refueling at the station.");
		}
	}
	static class ElectricScooter implements Vehicle{
		public void start() {
			System.out.println("Electric scooter powered on.");
		}
		public void stop() {
			System.out.println("Electric scooter powered off.");
		}
//		public void refuel() {
//			System.out.println("Car is refueling at the station.");
//		}
	}
	static class RentalSystem {
		public static void main(String[] args) {
			Car c=new Car();
			ElectricScooter e=new ElectricScooter();
			c.start();
			c.stop();
			c.refuel();
			e.start();
			e.stop();
			

		}
	}
	

}
