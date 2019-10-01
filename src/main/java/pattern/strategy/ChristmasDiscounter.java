package pattern.strategy;

import java.math.BigDecimal;

class ChristmasDiscounter implements Discounter {
	@Override
	public BigDecimal apply(final BigDecimal amount) {
		return amount.multiply(BigDecimal.valueOf(0.9));
	}
}
