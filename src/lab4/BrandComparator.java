package lab4;

import java.util.Comparator;

public class BrandComparator implements Comparator <Clothes> {
    @Override
    public int compare(Clothes clothes1, Clothes clothes2) {
        return clothes1.getBrand().compareTo(clothes2.getBrand());
    }
}
