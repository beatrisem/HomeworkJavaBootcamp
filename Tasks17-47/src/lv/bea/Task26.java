package lv.bea;

import java.util.Scanner;

public class Task26 {
    public static void substringMethod() {

        //Task 26
//Izveidot string masīvu ar cilvēku vārdiem (Vēlams ne mazāk kā 3).
//1. Izdrukāt visus vārdus.
//2. Izdrukāt tikai tos vārdus, kuri sākās ar "J".
//Izmantojam Substring metodi.

        String[] names = {"anna", "janis", "toms"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            if (names[i].substring(0, 1).equals("j")) {
                System.out.println(names[i]);
            }

        }

    }
}
