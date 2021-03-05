package principle.dependency.inversion.together;

import lombok.Getter;

import java.util.HashMap;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
@Getter
class InMemoryDataStore extends HashMap<Integer, Customer> {
}
