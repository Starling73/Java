package lab6;

import java.util.Comparator;

public class PriceWeightComparator implements Comparator<Cargo> {
    @Override
    public int compare(Cargo cargo1, Cargo cargo2) {
        return Float.compare(cargo1.getQuality(), cargo2.getQuality());
    }
}
