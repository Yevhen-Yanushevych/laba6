package ua.lviv.iot;

public class Tripod extends Devices {

    private double lenght;
    private final Kindjob kindjob = Kindjob.PHOTO;


    public Tripod(final int price, final int weight,
                  final String material, final String brand,
                  final double lenght) {
        super(price, weight, material, brand);
        this.lenght = lenght;
    }


    public Kindjob getKindjob() {
        return kindjob;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(final double lenght) {
        this.lenght = lenght;
    }
}
