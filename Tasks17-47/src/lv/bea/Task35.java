package lv.bea;

public class Task35 {

//Task 35
//Definēt bool tipa masīvu ar 10 elementiem, kur katra vērtība atbilst vienam krustojumam. Programmai ir jānosaka, vai var izbraukt cauri visiem krustojumiem. Ja visus krustojumus izbraukt nevar, ir jāizdrukā, kuram krustojumam netiek cauri.

    public static void task34() {
        boolean[] crossroads = {true, true, false, true, true, false, true, true, false, true};

        for (int i = 0; i < crossroads.length; i++) {
            if (crossroads[i] == false) {
                i += 1;
                System.out.println("have to stop at: " + i);
            }
        }
    }
}
