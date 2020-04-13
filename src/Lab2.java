/*

Зачетка №9124

C5 = 4
C7 = 3
C11 = 5

*/

import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        int[][] A = {{3, 2, 1},
                {1, -3, 2},
                {1, 2, 3}};

        int[][] B = {{2, 3, 1},
                {3, 1, 2},
                {2, 1, 3}};

        int[][] C = new int[3][3];
        int S1 = 0;
        int S2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            Arrays.sort(C[i]);
            if ((i + 1) % 2 == 0) {
                S1 += C[i][0];
            } else {
                S2 += C[i][3 - 1];
            }
        }
        System.out.println("S1 = " + S1);
        System.out.println("S2 = " + S2);
    }
}
