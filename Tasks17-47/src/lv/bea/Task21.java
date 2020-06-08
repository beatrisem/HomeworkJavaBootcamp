package lv.bea;

public class Task21 {
    public static void switchName() {

//Task 21
//Izvedot console aplikāciju, kurā ir definēts string tipa masīvs ar sākotnējām vērtībām "Jānis", "Pēteris", "Andris".
//Izvadīt uz ekrāna masīva otrā elementa vērtību ("Pēteris"). Samainīt masīva 3 elementa vērtību no "Andris" uz "Jēkabs".

        String[] names = {"Janis", "Peteris", "Andris"};
        System.out.println(names[1]);
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Andris")) {
                names[i] = "Jekabs";

            }

        }
    }
}
