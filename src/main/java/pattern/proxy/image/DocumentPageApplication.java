package pattern.proxy.image;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class DocumentPageApplication {

	public static void main(String[] args) {
		System.out.println("==ImageFromDisk==");
		Image imageFromDisk = new ImageFromDisk();
		imageFromDisk.display();

		System.out.println("==ProxyImage==");
		Image imageProxy = new ImageProxy();
		imageProxy.display();
	}
}
