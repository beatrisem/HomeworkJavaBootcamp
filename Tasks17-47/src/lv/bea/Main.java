package lv.bea;

import java.util.Scanner;

import static lv.bea.Task47.printGreeting;

public class Main {

    public static void main(String[] args) {
        // bool();

        //firstLast();

        // switchInt();

        //Task22
       WeekDaysTask22 day = WeekDaysTask22.PIEKTDIENA;
       System.out.println(day);
       System.out.print(java.util.Arrays.asList(WeekDaysTask22.values()));

//        breakMethod();

//       forEachCycle();

//       substringMethod();

//        dublicates();

//        firstLetterCounter();

//         printGreeting(3);

        printMyName(getMyName());

    }


    public static String getMyName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String firstName = sc.nextLine();
        System.out.println("enter surname");
        String lastName = sc.nextLine();

        String fullName = firstName.concat(" " + lastName);
        return fullName;

        // System.out.println(firstName.substring(0, 1).toUpperCase() + ". " + lastName.substring(0,1).toUpperCase() + lastName.substring(1));

    }

    public static void printMyName(String fullName) {
        System.out.println(fullName);
    }


}
