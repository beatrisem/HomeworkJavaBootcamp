package lv.bea;

import java.util.Arrays;

public class Task74 {

//Task 74 chess
//Izveidot algoritmu, kurš var izveidot šādu rakstu no divdimensīju masīva.

    public static void chess() {
        String[][] chess = new String[5][5];

        for (int i = 0; i < chess.length; i++) {

            for (int j = 0; j < chess.length; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "B";
                } else {
                    chess[i][j] = "W";
                }
            }
            System.out.println(Arrays.toString(chess[i]));
        }
    }
}