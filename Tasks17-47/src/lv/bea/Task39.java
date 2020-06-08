package lv.bea;

import java.util.ArrayList;

public class Task39 {

//Task 39
// Ir dots int tipa masīvs ar sākotnējām vērtībām 4, 68, 7, 12, 56, 33, 1, 90, 4. Ir jāatrod visas vērtības, kuras lielākas par 15 un jāievieto jaunā int tipa masīvā, kura saturs ir jāizvada uz ekrāna.


    public static void findLargerThan15() {

        int[] arr = {4, 68, 7, 12, 56, 33, 1, 90, 4};
        ArrayList<Integer> largerNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 15) {
                largerNumbers.add(arr[i]);
            }
        }
        System.out.println(largerNumbers);
    }
}