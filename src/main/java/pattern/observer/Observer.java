package pattern.observer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Observer {

	private final String name;

	private int value;

	public void update(int value) {
		System.out.println("Observer " + name + " received value update: " + value);
		this.value = value;
	}
}
