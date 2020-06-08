package lv.bea;

import java.util.Random;

public class Task42 {

    //uzd random 42
    //Izveidot divdimensiju masīvu int[5,5] un piešķirt elementiem vērtības. Izdrukāt visu elementu vērtības console. Izmantojiet gadījuma skaitļu ģenerātoru vērtību veidošanai.

    public static void numbersInGroups() {
        int[][] arr = new int[5][5];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(25);
                System.out.println(arr[i][j] + ",");
            }
            System.out.println("");
        }

    }
}
