package lv.bea.eight;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static final int RANGE_START = 0;
    private static final int RANGE_END = 30;

    public static final int CAR_ONE = 3000;
    public static final int CAR_TWO = 6000;
    public static final int CAR_THREE = 9000;

    public static final int CAR_ONE_LENGTH = 6;
    public static final int CAR_TWO_LENGTH = 9;
    public static final int CAR_THREE_LENGTH = 12;


    public static void main(String[] args) {


// task 10
//Mūsu bankas kontā ir 30 naudiņas. Paprasīt lietotājam cik daudz naudas izņemt. Un atkarībā no tā vai var izņemt vai nē parādam paziņojumu.

        Scanner input = new Scanner(System.in);
        System.out.println("enter amount: ");

        int amount = input.nextInt();

        if (amount > RANGE_START && amount <= RANGE_END) {
            System.out.println("you can withdraw: " + amount);
        } else {
            System.out.println("not sufficient funds. your account has eur: " + RANGE_END);
        }

//task 11
//Autovadītājs pārsniedza ātrumu par x km/h (Lietotājs ievada). Gadījumā, ja ātrums pārsniegts vairāk par 10, tad sods 15, ja vairāk par 20 tad sods 30, ja vairāk par 30, tad tiesības nost.

        Scanner atrums = new Scanner(System.in);
        System.out.println("enter speed: ");

        int speed = atrums.nextInt();

        if (speed > 30) {
            System.out.println("tiesibas nost");
        } else if (speed > 20 && speed <= 30) {
            System.out.println("sods 30 eur");
        } else if (speed > 10 && speed <= 20) {
            System.out.println("sods 15 eur");
        } else {
            System.out.println("viss ok");
        }


//task 12
//Mums ir trīs kravas mašīnas, katra mašīna ir ar attiecīgu izmēru un kravnesību. Pirmā var vest 3t otrā 6t un trešā 9t. Pirmās mašīnas kravas nodalījums ir 3mx6mx2m, otrās 3mx9mx2m, trešās kravas nodalījums ir 3mx12mx2m. Programmai ir jānosaka, ar kurām mašīnām var vest noteiktu preci, ar konkrētu izmēru un svaru. Vedamās preces izmēru un svaru jāpaprasa lietotājam.

        Scanner svars = new Scanner(System.in);
        System.out.println("enter weight: ");
        int weight = svars.nextInt();

        Scanner garums = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = garums.nextInt();

        if (weight <= CAR_ONE && length <= CAR_ONE_LENGTH) {
            System.out.println("cargo fits in car one");

        } else if (weight <= CAR_TWO && length <= CAR_TWO_LENGTH) {
            System.out.println("cargo fits in car two");

        } else if (weight <= CAR_THREE && length <= CAR_THREE_LENGTH) {
            System.out.println("cargo fits in car two");
        } else {
            System.out.println("cargo is too large!");
        }

    }
}

