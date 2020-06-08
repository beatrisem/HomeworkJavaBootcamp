package lv.bea;

import java.util.Scanner;

public class Task45 {

    public static void task45() {
//uzd45
//Izveidot console aplikāciju, kura lietotājam paprasīs, cik reizes ir jāatkārto for cikls.
        Scanner sc = new Scanner(System.in);
        System.out.println("how many times?");

        for (int i = sc.nextInt(); i > 0; i--) {
            System.out.println("hello again");
        }
    }
}