package pattern.proxy.internet;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class PageBrowsingApplication {
	public static void main(String[] args) {
		Network schoolNetwork = new SchoolNetwork();

		schoolNetwork.browsePage("uni-page.com");
		schoolNetwork.browsePage("stackoverflow.com");
	}
}
