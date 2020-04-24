package Start;

import factory.interfaces.TransportFactory;
import factoty.iml.USAfactory;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class Main {
	
	public static void main (String [] arg) {
		TransportFactory transportFactory =new USAfactory();
	    Aircraft aircraft = transportFactory.creAircraft();
	    aircraft.flight();
	    Car car = transportFactory.createCar();
	    car.drive();
	}

}
