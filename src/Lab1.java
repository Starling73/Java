/*
Зачетка №9124

С2 = 0    O1 = "+"
С3 = 1    C = 1
С5 = 4    O2 = "-"
С7 = 3    тип индексов "long"

*/


public class Lab1 {
    public static void main(String[] args) {
        int a = -5;
        int b = -5;
        int n = 5;
        int m = 5;
        final int C = 1;
        if (a > n || b > m) {
            System.out.println("Sorry, but a > n or b > m. Try other value");
            return;
        }
        if (a <= -C && n > -C) {
            System.out.println("Error! Dividing by zero");
            return;
        }
        double S = 0;
        for (long i = a; i <= n; i++) {
            for (long j = b; j <= m; j++) {
                S += (double) (i - j) / (double) (i + C);
            }
        }
        System.out.println("S = " + S);
    }
}

