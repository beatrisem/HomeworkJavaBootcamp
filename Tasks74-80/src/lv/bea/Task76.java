package lv.bea;

import java.util.Arrays;

public class Task76 {

//uzd 76
//Izveidot algoritmu, kurš var izveidot šādu rakstu no divdimensīju masīva.
    public static void around() {

        String[][] around = new String[5][5];

        for (int i = 0; i < around.length; i++) {
            for (int j = 0; j < around.length; j++) {
                if (i % 2 == 0 && j == 2) {
                    around[i][j] = "W";
                } else if (j == 0 && i % 2 == 1) {
                    around[i][j] = "W";
                } else if (j == 4 && i % 2 == 1) {
                    around[i][j] = "W";
                } else {
                    around[i][j] = "-";
                }
            }

            System.out.println(Arrays.toString(around[i]));

        }
    }
}
