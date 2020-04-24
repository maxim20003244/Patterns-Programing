
import context.TransformerContext;
import state.FireState;
import state.MoveState;

public class Main {
	
	public static void main (String []arg) {
		TransformerContext transformerContext =new TransformerContext();
		FireState fireState = new FireState();
		MoveState moveState =new MoveState();
		transformerContext.setState(fireState);
		transformerContext.action();
	}

}
