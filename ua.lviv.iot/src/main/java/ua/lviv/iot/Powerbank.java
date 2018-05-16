package ua.lviv.iot;

public class Powerbank extends Devices {
    private double batteryCapacity;
    private final Kindjob kindjob = Kindjob.VIDEO;



    public Powerbank(final int price, final int weight,
                     final String material, final String brand,
                     final double batteryCapacity) {
        super(price, weight, material, brand);
        this.batteryCapacity = batteryCapacity;
    }

    public Kindjob getKindjob() {
        return kindjob;
    }




}
