package Publish;

import java.util.ArrayList;

public interface PublisherInterface {
	ArrayList< PulisherActionListener> getListeners();
	void addListeners(PulisherActionListener listener);
	public void removeListenrs(PulisherActionListener listener);
	public void removeAllListeners();
	public void notifySubscribers(String message);

}
