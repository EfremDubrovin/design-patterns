package pattern.observer;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * Concrete implementation of the Subject
 */
public class SimpleValue implements Observable {

	private final Set<Observer> observers = new HashSet<>();

	@Getter
	private int value;

	public void setValue(int value) {
		System.out.println("Changing value Subject value to: " + value);
		this.value = value;
		notifyObservers(value);
	}

	public void register(Observer o) {
		observers.add(o);
	}

	public void unRegister(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers(int value) {
		observers.forEach(observer -> observer.update(value));
	}
}
