package ua.lviv.iot;

public abstract class Devices {
    private int price;
    private int weight;
    private String material;
    private String brand;


    public abstract Kindjob getKindjob();



    public Devices(final int price, final int weight,
                   final String material, final String brand) {

        this.price = price;
        this.weight = weight;
        this.material = material;
        this.brand = brand;
    }

    public final int getWeight() {
        return weight;
    }


}
