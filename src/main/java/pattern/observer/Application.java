package pattern.observer;

public class Application {

	public static void main(String[] args) {
		SimpleValue subject = new SimpleValue();
		Observer observer1 = new Observer("Observer 1");
		Observer observer2 = new Observer("Observer 2");
		subject.register(observer1);
		subject.register(observer2);
		subject.setValue(10);
		subject.setValue(20);
		subject.unRegister(observer2);
		subject.setValue(30);
	}
}
