package pgdp.collections;

public class FishyProduct {

    private final String name;
    private final int price;

    public FishyProduct(String name, int price) {
        if(name==null || price<=0) throw new IllegalArgumentException();
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FishyProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
