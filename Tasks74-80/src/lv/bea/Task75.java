package lv.bea;

import java.util.Arrays;

public class Task75 {
    //uzd diagonāles 75
    //Izveidot algoritmu, kurš var izveidot šādu rakstu no divdimensīju masīva.

    public static void diagonals() {

        String[][] diagonals = new String[5][5];

        for (int i = 0; i < diagonals.length; i++) {
            for (int j = 0; j < diagonals.length; j++) {
                if (i == j) {
                    diagonals[i][j] = "B";
                } else if (i + j == 4) {
                    diagonals[i][j] = "B";
                } else {
                    diagonals[i][j] = "-";
                }
            }

            System.out.println(Arrays.toString(diagonals[i]));

        }
    }
}