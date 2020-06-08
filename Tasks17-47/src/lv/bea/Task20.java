package lv.bea;

public class Task20 {
    public static void switchInt(){
// Task 20
// Izveodot console aplikāciju, kurā ir int masīvs ar vērtībām 7, 4, 7, 3, 6, 9, 2. Samainīt elementu, kura sākotnējā vērtība ir 3 uz 10.

        int[] values = {7, 4, 7, 3, 6, 9, 2};

        for (int i = 0; i < values.length; i++) {
            if(values[i] == 3){
                values[i] = 10;
            }
            System.out.println(values[i]);
        }


    }
}
