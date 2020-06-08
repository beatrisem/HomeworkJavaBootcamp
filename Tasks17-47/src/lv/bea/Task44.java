package lv.bea;

public class Task44 {

//uzd 44
//Definēt int tipa masīvu ar 8 elementiem. Sasummēt tikai tos elementus, kuru vērtība ir lielāka par 10.
    public static void task44() {
        int[] arr = {3, 5, 7, 9, 10, 64, 23, 22};
        var sum = 0;

        for (int num : arr) {
            if (num > 10) {
                sum += num;
            }

        }
        System.out.println(sum);

    }
}