package Subscriber;

import Publish.PulisherActionListener;

public class Subscriber2 implements PulisherActionListener {

	@Override
	public void doAction(String message) {
		System.out.println("Subscriber2");
		
	}

}
