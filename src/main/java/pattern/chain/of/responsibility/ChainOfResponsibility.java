package pattern.chain.of.responsibility;

public class ChainOfResponsibility {
	public static void main(String[] args) {
		MoneyHandler fiftyHandler = new MoneyHandler(50);
		MoneyHandler twentyHandler = new MoneyHandler(20);
		MoneyHandler tenHandler = new MoneyHandler(10);
		MoneyHandler fiveHandler = new MoneyHandler(5);
		MoneyHandler twoHandler = new MoneyHandler(2);

		MoneyHandler rootHandler = fiftyHandler;
		rootHandler.addNext(twentyHandler);
		rootHandler.addNext(tenHandler);
		rootHandler.addNext(fiveHandler);
		rootHandler.addNext(twoHandler);

		rootHandler.handle(100);
		rootHandler.handle(127);
		rootHandler.handle(111);
	}
}

class MoneyHandler {
	private int banknote;

	public MoneyHandler(int banknote) {
		this.banknote = banknote;
	}

	private MoneyHandler next;

	void addNext(MoneyHandler next) {
		if (this.next == null) {
			this.next = next;
		} else {
			this.next.addNext(next);
		}
	}

	void giveBill() {
		System.out.println("bill: " + banknote);
	}

	void handle(int amount) {
		if (amount == 0) {
			System.out.println("Transaction completed");
			return;
		}
		int billsToGive = amount / banknote;
		if (billsToGive == 0) {
			if (next == null) {
				System.out.println("Transaction failed");
				return;
			}
			next.handle(amount);
		} else {
			for (int i = 0; i < billsToGive; i++) {
				giveBill();
			}
			if (next == null) {
				System.out.println("Transaction succeeded");
				return;
			}
			next.handle(amount % banknote);
		}
	}
}
