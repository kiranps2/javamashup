package DAY9;
import java.util.*;
public class BookingApp {
	public static void main(String[] args) {
		Ride auto=new AutoRide();
		Ride car=new CarRide();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the ride type");
		String ridetyp=input.nextLine();
		System.out.println("enter the distance in kilometers ");
		int dis=input.nextInt();
		if(ridetyp.equals("auto")) {
			auto.rideType();
			System.out.println("total km: "+dis*auto.calculateFare());
			
		}else if(ridetyp.equals("car")) {
			car.rideType();
			System.out.println("total km: "+dis*car.calculateFare());
		}
		
	input.close();	
	}

}
