package lv.bea;

public class Task25 {
//Task 25
//Deklarēt int[] - masīvu int[] numbers = { 1, 3, 4, 8, 0, 23 }; Izdrukāt uz ekrāna visas masīva elementu vērtības un pēc tam tikai tās vērtības, kuras lielākas par 5.

    public static void forEachCycle() {
        int[] numbers = {1, 3, 4, 8, 0, 23};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 5) {
                System.out.println(numbers[i]);
            }
        }


    }
}
