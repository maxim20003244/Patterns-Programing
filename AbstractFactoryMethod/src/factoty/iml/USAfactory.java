package factoty.iml;

import factory.interfaces.TransportFactory;
import transp.imp.aircaft.Tu134;
import transp.impl.car.Porsche;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class USAfactory implements TransportFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Porsche();
	}

	@Override
	public Aircraft creAircraft() {
		// TODO Auto-generated method stub
		return new Tu134();
	}

}
