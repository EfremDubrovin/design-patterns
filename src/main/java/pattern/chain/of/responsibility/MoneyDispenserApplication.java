package pattern.chain.of.responsibility;

import lombok.RequiredArgsConstructor;

public class MoneyDispenserApplication {
	public static void main(String[] args) {
		MoneyDispenser fiftyBillDispenser = new MoneyDispenser(50);
		MoneyDispenser twentyBillDispenser = new MoneyDispenser(20);
		MoneyDispenser tenBillDispenser = new MoneyDispenser(10);

		MoneyDispenser rootDispenser = fiftyBillDispenser;
		rootDispenser.addNext(twentyBillDispenser);
		rootDispenser.addNext(tenBillDispenser);

		rootDispenser.dispense(130);
	}
}

@RequiredArgsConstructor
class MoneyDispenser {
	private final int billSize;

	private MoneyDispenser next;

	void addNext(MoneyDispenser moneyDispenser) {
		if (this.next == null) {
			this.next = moneyDispenser;
		} else {
			next.addNext(moneyDispenser);
		}
	}

	void giveBill() {
		System.out.println("bill: " + billSize);
	}

	void dispense(int amount) {
		int remainingAmount = amount - billSize;
		if (remainingAmount == 0) {
			giveBill();
		} else if (remainingAmount > 0) {
			giveBill();
			this.dispense(remainingAmount);
		} else {
			next.dispense(amount);
		}
	}
}
