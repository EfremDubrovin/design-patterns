package pattern.proxy.internet;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class Internet implements Network {

	@Override
	public void browsePage(String pageUri) {
		System.out.println("You accessed: " + pageUri);
	}
}
