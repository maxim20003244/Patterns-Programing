package Cars;

public class CarSelector {
	private static CarSelector instance;
	private CarSelector () {
		
	}
	
	public static CarSelector getCarSelector() {
		if(instance==null) {
			instance = new CarSelector();
		}
		return instance;
	}

	public Car getCar (Rooad_type rooad_type) {
		Car car = null;
		switch(rooad_type) {
		case CITY:
			car = new Porsche();
			break;
		case OFF_CITY:
			car = new Geep();
			break;
		case GAZON:
			car= new NeeGeep();
			break;
		}
		return car;
	}

}
