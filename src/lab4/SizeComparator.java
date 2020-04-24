package lab4;

import java.util.Comparator;

public class SizeComparator implements Comparator <Clothes> {

    @Override
    public int compare(Clothes clothes1, Clothes clothes2) {
        return -clothes1.getSize().compareTo(clothes2.getSize());
    }
}
