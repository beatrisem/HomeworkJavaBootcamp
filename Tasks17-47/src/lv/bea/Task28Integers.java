package lv.bea;

import java.util.Scanner;

public class Task28Integers {

//Task 28
//Uztaisīt console aplikāciju, kura lietotājam paprasa ievadīt veselu skaitli. Ja nav ievadīts vesels skaitlis, paziņot par kļūdu un likt ievadīt atkārtoti. Ja ievadītā vērtība ir skaitlis, tad izvadīt to uz ekrāna.

    public static void integerTest() {

        Scanner sc = new Scanner(System.in);
        Boolean isThisInteger = false;

        do {
            System.out.println("Enter a number");

            while (!sc.hasNextInt()) {
                System.out.println("Enter an integer again");
                sc.next();
            }
            System.out.println("number accepted" + sc.next());
            isThisInteger = true;

        } while (!isThisInteger);
    }

}
