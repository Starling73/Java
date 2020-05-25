/*
C13 = 11    Кава
 */

package lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SortOfCoffee sort1 = new Arabica();
        SortOfCoffee sort2 = new Robusta();
        SortOfCoffee sort3 = new Liberica();

        Cargo cargo1 = new Cargo(sort1, "beans", (float) 15, (float) 123.5);
        Cargo cargo2 = new Cargo(sort2, "ground", (float) 15, (float) 1236.5);
        Cargo cargo3 = new Cargo(sort3, "bags", (float) 15, (float) 12345.5);
        Cargo cargo4 = new Cargo(sort3, "instant", (float) 10, (float) 123.5);

        Cargo[] cargos = new Cargo[]{cargo1, cargo2, cargo3, cargo4};
        Arrays.sort(cargos, new WeightPriceComparator());

        Van van1 = new Van(cargos);

        System.out.println(van1.getFullprice());
        System.out.println(van1.getFullweight());
        System.out.println();
        System.out.println(van1);

    }
}
