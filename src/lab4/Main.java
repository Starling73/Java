package lab4;/*

Зачетка №9124

C11 = 5  одяг

*/



public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Clothes((float) 12344.00, 52, "jacket", "female", "oodji"),
                new Clothes((float) 898.99, 48, "jeans", "male", "Collin`s"),
                new Clothes((float) 939.49, 50, "pullover", "male", "adidas")
        };
        for (int i = 0; i < clothes.length; i++) {
            System.out.println(clothes[i]);
            System.out.println();
        }
    }
}