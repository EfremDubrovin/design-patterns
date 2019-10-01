package pattern.strategy;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

interface Discounter extends UnaryOperator<BigDecimal> {

	default Discounter combine(Discounter after) {
		return value -> after.apply(this.apply(value));
	}
}
