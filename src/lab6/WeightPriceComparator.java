package lab6;

import java.util.Comparator;

public class WeightPriceComparator implements Comparator <Cargo> {
    @Override
    public int compare(Cargo cargo1, Cargo cargo2) {
        int priceCompareResult = -Float.compare(cargo1.getPrice(), cargo2.getPrice());
        return priceCompareResult !=0 ? priceCompareResult : Float.compare(cargo1.getWeight(), cargo2.getWeight());
    }
}
