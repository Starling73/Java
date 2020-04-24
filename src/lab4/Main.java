/*

Зачетка №9124

C11 = 5  одяг

*/

package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Clothes((float) 12344.00, 52, "jacket", "female", "Oodji"),
                new Clothes((float) 898.99, 48, "pullover", "male", "Adidas"),
                new Clothes((float) 939.49, 50, "jeans", "male", "Collin`s")
        };
        System.out.println("Сортировка по размеру по убыванию:\n");
        Arrays.sort(clothes, new SizeComparator());
        for (int i = 0; i < clothes.length; i++) {
            System.out.println(clothes[i]);
            System.out.println();
        }
        System.out.println("Сортировка по брэнду по возрастанию:\n");
        Arrays.sort(clothes, new BrandComparator());
        for (int i = 0; i < clothes.length; i++) {
            System.out.println(clothes[i]);
            System.out.println();
        }
    }
}
