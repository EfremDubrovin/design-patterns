package pattern.proxy.image;

/**
 * Created by Efrem Dubrovin - Delta Source Bulgaria on 26/02/2021.
 */
public class ImageProxy implements Image {

	private Image image;

	@Override
	public void display() {
		if(image == null) {
			image = new ImageFromDisk();
		}
		image.display();
	}
}
