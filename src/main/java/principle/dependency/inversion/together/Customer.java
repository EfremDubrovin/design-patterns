package principle.dependency.inversion.together;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
@Getter
@RequiredArgsConstructor
class Customer {

	private final Integer id;

	private final String name;
}
