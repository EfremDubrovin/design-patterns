package pattern.proxy.image;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class ImageFromDisk implements Image {

	public ImageFromDisk() {
		System.out.println("Loading image from disk...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException("Kole Poluchi li?", e);
		}
		System.out.println("Image loaded.");
	}

	@Override
	public void display() {
		System.out.println("Displaying image from disk");
	}
}
