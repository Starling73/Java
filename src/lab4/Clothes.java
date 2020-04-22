package lab4;

public class Clothes implements Comparable {
    private float price;
    private int size;
    private String type;
    private String genter;
    private String brand;

    public Clothes(float price, int size, String type, String genter, String brand) {
        this.price = price;
        this.size = size;
        this.type = type;
        this.genter = genter;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "price = " + price +
                ", size = " + size +
                ", type = '" + type + '\'' +
                ", genter = '" + genter + '\'' +
                ", brand = '" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return type.compareTo(((Clothes) o).type);
    }
}
