package decorator;

import Object.Circle;
import Object.Rectangle;
import Object.Shape;

public class Main {
	
	public static void main(String []arg) {
		Shape circle = new Circle();
		Shape rectangleShape = new Rectangle();
		
		Shape redCircleShape = new RedShapeDecorator(new Circle());
		Shape redRectanglShape = new RedShapeDecorator(new Rectangle());
		
	
		//circle.draw();
		redCircleShape.draw();
		
		
	}

}
