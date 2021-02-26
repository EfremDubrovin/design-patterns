package pattern.proxy.internet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class SchoolNetwork implements Network {

	private Set<String> forbiddenDomains;

	private Network internet = new Internet();

	public SchoolNetwork() {
		this.forbiddenDomains = new HashSet<>();
		forbiddenDomains.add("hornpub.com");
		forbiddenDomains.add("stackoverflow.com");
	}

	@Override
	public void browsePage(String pageUri) {
		if(forbiddenDomains.contains(pageUri.toLowerCase())) {
			System.out.println("Access forbidden for domain: " + pageUri);
			return;
		}
		internet.browsePage(pageUri);
	}
}
