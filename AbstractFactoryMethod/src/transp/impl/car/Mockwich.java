package transp.impl.car;

import transport.interfaces.Car;

public class Mockwich implements Car{

	@Override
	public void drive() {
		System.out.println("Mosckwich drive");
		
	}

	@Override
	public void stop() {
		System.out.println("Mosckwich stop");
		
	}

}
