package Publish;

import java.util.ArrayList;

import javax.xml.bind.Marshaller.Listener;

public class Oublisher implements PublisherInterface {
private ArrayList<PulisherActionListener> Listener = new ArrayList<PulisherActionListener>();
	@Override
	public ArrayList<PulisherActionListener> getListeners() {
		// TODO Auto-generated method stub
		return Listener;
	}

	@Override
	public void addListeners(PulisherActionListener listener) {
		Listener.add(listener);
		
	}

	@Override
	public void removeListenrs(PulisherActionListener listener) {
		Listener.remove(Listener);
		
	}

	@Override
	public void removeAllListeners() {
		Listener.removeAll(Listener);
		
	}

	@Override
	public void notifySubscribers(String message) {
		for (PulisherActionListener pulisherActionListener : Listener) {
		  pulisherActionListener.doAction(message);	
		}
		
		}
	public void createMessages(String message) {
		System.out.println("Publisher create message:" + message);
		notifySubscribers(message);
	}

}
