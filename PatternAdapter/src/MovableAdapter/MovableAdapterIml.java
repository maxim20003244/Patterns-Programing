package MovableAdapter;

import object.Movable;

public class MovableAdapterIml implements MovableAdater {
private Movable luxuryCars;


	
	public MovableAdapterIml(Movable luxuryCars) {
	this.luxuryCars = luxuryCars;
	
}



	@Override
	public double getSpeed() {
		
		return convertMPHtoKMPH(luxuryCars.getspeed());
	}
	private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
	
}
}