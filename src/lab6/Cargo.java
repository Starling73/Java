package lab6;

public class Cargo {
    private Float weight;
    private Float oneBruttoWeight;
    private int quantity;
    private Float price;
    private String state;
    private String sortOfCoffee;
    private Float quality;

    public Cargo(SortOfCoffee sortOfCoffee, String state, int quantity, float price) {
        this.quantity = quantity;
        this.state = state;
        if (state == "beans") {
            oneBruttoWeight = 400 * (float) Math.pow(10, -6);
            this.weight = oneBruttoWeight * quantity;
        } else if (state == "ground") {
            oneBruttoWeight = 350 * (float) Math.pow(10, -6);
            this.weight = oneBruttoWeight * quantity;
        } else if (state == "bags") {
            oneBruttoWeight = 12 * (float) Math.pow(10, -6);
            this.weight = oneBruttoWeight * quantity;
        } else {
            oneBruttoWeight = 450 * (float) Math.pow(10, -6);
            this.weight = oneBruttoWeight * quantity;
        }
        this.price = price * quantity;
        this.sortOfCoffee = sortOfCoffee.getClass().getSimpleName();
        this.quality = price / oneBruttoWeight;
    }

    public Float getQuality() {
        return quality;
    }

    public float getPrice() {
        return price;
    }

    public String getSortOfCoffee() {
        return sortOfCoffee;
    }

    public float getWeight() {
        return weight;
    }
}
