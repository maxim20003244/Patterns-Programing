package Cars;

public class Geep implements Car {

	@Override
	public void drive() {
        System.out.println("Car drive, max.speed 150km/h");		
	}

	@Override
	public void stop() {
		System.out.println("Car stoping her!");
		
	}

}
