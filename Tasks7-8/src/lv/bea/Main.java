package lv.bea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//task 7
//Izveidot consoles aplikāciju, kura no lietotāja paparasa divas vērtības. Programmā ir jāpanāk šo divu vērtību summēšana. Pirms vērtību summēšanas ir jāpanāk, ka vērtībai x ir jābūt robežās no 0 līdz 20. Vērtībai y ir jābūt robežās no 30 līdz 50. Ja ievadītais skaitlis nav šajās robežās uz ekrāna ir jāizvada atbilstošs paziņojums.

        Scanner sc = new Scanner(System.in);

        System.out.println("enter x value: ");
        var x = sc.nextInt();

        System.out.println("enter y value: ");
        var y = sc.nextInt();

        if (x < 0 || x > 20) {
            System.out.println("enter x in the range 0 - 20");
        } else if (y < 30 || y > 50) {
            System.out.println("enter y in the range 30-50");
        } else {
            var sum = x + y;
            System.out.println(sum);
        }

        //ar ciklu

        Scanner input = new Scanner(System.in);

        System.out.println("enter x1 value: ");
        var x2 = sc.nextInt();

        System.out.println("enter y1 value: ");
        var y2 = sc.nextInt();

        while (true) {
            System.out.println("enter x1: ");
            x = input.nextInt();

            if (x2 >= 0 && x2 <= 20) {
                break;
            } else {
                System.out.println("enter x1 again");
            }
        }

        while (true) {
            System.out.println("enter y2: ");
            y = input.nextInt();

            if (y2 >= 30 && y2 <= 50) {
                break;
            } else {
                System.out.println("enter y2 again: ");
            }

        }

        var sum = x + y;
        System.out.println(sum);



//task8
//Mums ir māja ar 5 stāviem un pagrabu. Lietotājam tiek paprasīts ievadīt mājas priekšmetu, piemēram, “galds”, un mūsu programmai ir jāizvada, kurā stāvā šis priekšmets tiks novietots. Nosacījumi priekšmeta novietšanai ir: Priekšmeti, kuri sākas ar burtiem a,b,c,d tiks novietoti 1. Stāvā. Priekšmeti, kuri sākas ar burtiem e,f,g,h tiks novietoti 2. Stāvā. Nākamie burti attiecīgi 3., 4. un 5. stāvā. Visi pārējie priekšmeti tiks novietoti pagrabā.

        Scanner item = new Scanner(System.in);
        System.out.println("enter a thing: ");

        var thing = item.nextLine();

        char letter = thing.charAt(0);

        if (letter == 'a' || letter == 'b' || letter == 'c' || letter == 'd') {
            System.out.println("put in 1.st floor");
        } else if (letter == 'e' || letter == 'f' || letter == 'g' || letter == 'h') {
            System.out.println("put in 2.st floor");
        } else if (letter == 'i' || letter == 'j' || letter == 'k' || letter == 'l') {
            System.out.println("put in 3.st floor");
        } else if (letter == 'm' || letter == 'n' || letter == 'o' || letter == 'p') {
            System.out.println("put in 4.st floor");
        } else if (letter == 'q' || letter == 'r' || letter == 's' || letter == 't') {
            System.out.println("put in 5.st floor");
        } else {
            System.out.println("put in basement");
        }

    }
}
