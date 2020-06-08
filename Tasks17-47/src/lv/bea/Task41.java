package lv.bea;

import java.util.ArrayList;

public class Task41 {

    //Task 41
    //Definēt int masīvu ar 12 elementiem { 1, 56, 77, 89, 34, 22, 2, 3, 4, 8, 43, 56 }. Izdrukāt skaitļus console logā sadalot tos trijās grupās. Skaitļi robežās no 0-30, 31-60, 61-90.

    public static void numbersInGroups() {
        int[] numbers = {1, 56, 77, 89, 34, 22, 2, 3, 4, 8, 43, 56};
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] <= 30) {
                one.add(numbers[i]);
            } else if (numbers[i] > 30 && numbers[i] <= 60) {
                two.add(numbers[i]);
            } else if (numbers[i] > 60 && numbers[i] <= 90) {
                three.add(numbers[i]);
            }
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}