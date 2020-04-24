package factoty.iml;

import factory.interfaces.TransportFactory;
import transp.impl.car.Mockwich;
import transp.impl.car.Niva;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class RussianFactory implements TransportFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Mockwich();
	}

	@Override
	public Aircraft creAircraft() {
		// TODO Auto-generated method stub
		return null;
	}

}
