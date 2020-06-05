package lab6;

public class SortOfCoffee {
    private int field;
    @Override
    public String toString(){
        return "SortOfCofee{" +
                "sort: " + getClass().getSimpleName() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SortOfCoffee sortOfCoffee = (SortOfCoffee) obj;
        return field == sortOfCoffee.field;
    }
}
