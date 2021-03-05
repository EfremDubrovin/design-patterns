package customer.persistence;

import lombok.Getter;

import java.util.HashMap;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 05/03/2021.
 */
@Getter
public class InMemoryDataStore extends HashMap<Integer, String> {
}
