package lv.bea;

public class Task34 {

//Task 34
//Definēt int tipa masīvu, kurā būs 10 elementi. Izveidot for ciklu, kurš aizpildīs šo masīvu ar skaitļiem. Masīvā ir jāieraksta for cikla mainīgā vērtība.

    public static void task34() {

        int[] elements = new int[10];
        for (int i = 0; i < 10; i++) {
            elements[i] = i;
            System.out.println(elements[i]);
        }
    }
}