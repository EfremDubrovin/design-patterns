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
			.apply(BigDecimal.valueOf(100));

		// Then
		assertThat(discountedValue.doubleValue(), equalTo(50.0));
	}

	@Test
	public void applyDiscountsWithLambda() throws Exception {
		// Given
		List<Discounter> discounters = asList(
			amount -> amount.multiply(BigDecimal.valueOf(0.8)),
			amount -> amount.multiply(BigDecimal.valueOf(0.5))
		);

		// When
		BigDecimal value = BigDecimal.valueOf(100);
		for (Discounter discounter : discounters) {
			value = discounter.apply(value);
		}

		// Then
		assertThat(value.doubleValue(), equalTo(40.0));
	}

	@Test
	public void applyCombinedDiscounts() {
		// Given
		List<Discounter> discounters = asList(
			amount -> amount.multiply(BigDecimal.valueOf(0.8)),
			amount -> amount.multiply(BigDecimal.valueOf(0.5))
		);

		Discounter combinedDiscounter =
			discounters.stream()
				.reduce(v -> v, Discounter::combine);

		// When
		BigDecimal result = combinedDiscounter.apply(BigDecimal.valueOf(100));
		assertThat(result.doubleValue(), equalTo(40.0));
	}
}
