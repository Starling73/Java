package lab6;

public class Van {
    private Cargo[] cargos;
    private final float maxweight = 1;
    private final float maxprice = 600000;
    private float fullprice;
    private float fullweight;

    public Van(Cargo[] cargos) {
        this.cargos = cargos;

        for (int i = 0; i < cargos.length; i++) {
            this.fullprice += cargos[i].getPrice();
            this.fullweight += cargos[i].getWeight();
        }

    }

    public float getFullweight() {
        return fullweight;
    }

    public float getFullprice() {
        return fullprice;
    }

    @Override
    public String toString() {
        if (fullprice <= maxprice && fullweight <= maxweight) {
            for (int i = 0; i < cargos.length; i++) {
                System.out.println("Cargo{" +
                        "sort: " + cargos[i].getSortOfCoffee() + ", " + "price = " + cargos[i].getPrice() + ", " +
                        "weight = " + cargos[i].getWeight() + "}");
            }
        } else {
            System.out.println("You can not load the van, because the budget or weight is exceeded");
        }
        return "";
    }
}
