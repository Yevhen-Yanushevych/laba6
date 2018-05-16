package ua.lviv.iot;

public class Camera extends Devices {
	private int lens;
	private final Kindjob kindjob = Kindjob.VIDEO;
	

	public Camera(final int price, final int weight,
					final String material,
				 final String brand, final int lens) {
		super(price, weight, material, brand);
	this.lens = lens;
	}

	public Kindjob getKindjob() {
		return kindjob;
	}

	public int getLens() {
		return lens;
	}

	public void setLens(final int lens) {
		this.lens = lens;
	}

}
