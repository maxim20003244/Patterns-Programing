import Publish.Oublisher;
import Subscriber.Subscriber1;
import Subscriber.Subscriber2;

public class Main {
	public static void main (String[]arg) {
		Subscriber1 subscriber1 =new Subscriber1();
		Subscriber2 subscriber2 = new Subscriber2();
		
		Oublisher publisher = new Oublisher();
		publisher.addListeners(subscriber1);
		publisher.addListeners(subscriber2);
		
		publisher.createMessages("Messages");
		
	}

}
