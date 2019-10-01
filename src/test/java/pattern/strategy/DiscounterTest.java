package pattern.strategy;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class DiscounterTest {

	@Test
	public void applyEasterDiscount() throws Exception {
		// Given
		Discounter easterDiscounter = new EasterDiscounter();

		// When
		BigDecimal discountedValue = easterDiscounter
			.applyDiscount(BigDecimal.valueOf(100));

		// Then
		assertThat(discountedValue.doubleValue(), equalTo(50.0));
	}

	@Test
	public void applyDiscountsWithLambda() throws Exception {

		List<Discounter> discounters = asList(
			amount -> amount.multiply(BigDecimal.valueOf(0.8)),
			amount -> amount.multiply(BigDecimal.valueOf(0.5))
		);

		BigDecimal value = BigDecimal.valueOf(100);
		for (Discounter discounter : discounters) {
			value = discounter.applyDiscount(value);
		}

		assertThat(value.doubleValue(), equalTo(40.0));
	}
}
