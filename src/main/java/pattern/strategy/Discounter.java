package pattern.strategy;

import java.math.BigDecimal;

interface Discounter {
	BigDecimal applyDiscount(BigDecimal amount);
}
