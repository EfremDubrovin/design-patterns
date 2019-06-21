package pattern.observer;

/**
 * This is the Subject class
 */
public interface Observable {

	void register(Observer o);

	void unRegister(Observer o);

	void notifyObservers(int value);
}
