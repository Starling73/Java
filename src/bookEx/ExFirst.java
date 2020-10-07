package bookEx;

import java.util.Random;

public class ExFirst {
    public static void main(String[] args) {
        Random rand = new Random();
        float s, t, v;
        s = rand.nextFloat() * 100 + 1;
        t = rand.nextFloat() * 10 + 1;
        v = s / t;
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("v = " + v);
    }
}
