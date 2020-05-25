package lab6;

public class Van {
    private Cargo[] cargos;
    private float fullprice;
    private float fullweight;

    public Van(Cargo[] cargos){
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
    public String toString(){
        for (int i = 0; i < cargos.length; i++) {
            System.out.println("Cargo{" +
                    "price = " + cargos[i].getPrice() + ", " + "weight = " + cargos[i].getWeight() + "}");
        }
        return "";
    }
}
