package Subscriber;

import Publish.PublisherInterface;
import Publish.PulisherActionListener;

public class Subscriber1 implements PulisherActionListener{

	@Override
	public void doAction(String message) {
		System.out.println("Subscriber1");
		
	}

}
