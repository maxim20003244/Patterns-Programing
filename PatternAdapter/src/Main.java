import MovableAdapter.MovableAdapterIml;
import MovableAdapter.MovableAdater;
import object.BugatiVeyron;
import object.Movable;

public class Main {
	
	public static void main(String []arg) {
		Movable bugativeyron = new BugatiVeyron(231);
		MovableAdater bugativeyronAdapter = new MovableAdapterIml(bugativeyron);
		
		
		
		  System.out.println(bugativeyron.getspeed());
		  System.out.println(bugativeyronAdapter.getSpeed());
		 
	}

}
