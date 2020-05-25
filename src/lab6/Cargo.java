package lab6;

public class Cargo {
    private Float weight;
    private Float price;
    private String state;
    private SortOfCoffee sortOfCoffee;

    public Cargo(SortOfCoffee sortOfCoffee, String state, float weight, float price) {
        this.weight = weight;
        this.price = price;
        this.sortOfCoffee = sortOfCoffee;
        this.state = state;

    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }
}
