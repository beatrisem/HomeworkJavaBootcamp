package lv.bea;

public class Task17 {

//Task 17
//Deklarēt programmā bool tipa mainīgo, kura sākotnējā vērtība ir TRUE. Izveidot while ciklu, kurš atkārtojas tik ilgi kamēr mainīgā vērtība ir TRUE. Mainīgā vērtību uz FALSE ir jānomaina, tad, kad cikls ir atkārtojies 20 reizes.

public static void bool() {
    boolean start;
    start = true;
    int num = 0;

        while (num < 21) {
            System.out.println(" " + start);
            num += 1;
        }
        start = false;
        System.out.println(" " + start);
    }
}
