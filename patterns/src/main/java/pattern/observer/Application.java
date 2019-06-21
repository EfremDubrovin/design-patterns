package pattern.observer;

public class Application {

	public static void main(String[] args) {
		SimpleValue subject = new SimpleValue();
		Observer observer = new Observer();
		subject.register(observer);
		subject.setValue(10);
		subject.setValue(20);
		subject.unRegister(observer);
		subject.setValue(30);
	}
}
