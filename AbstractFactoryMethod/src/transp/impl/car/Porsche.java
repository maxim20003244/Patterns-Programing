package transp.impl.car;

import transport.interfaces.Car;

public class Porsche implements Car{

	@Override
	public void drive() {
		System.out.println("Porsche drive ");
		
	}

	@Override
	public void stop() {
		System.out.println("Porsche stop");
		
	}

}
