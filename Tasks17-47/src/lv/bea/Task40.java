package lv.bea;

public class Task40 {

 //uzd 40
//Definēt string tipa masīvu ar vērtībām “jānis”, “pēteris”, “andris”, “sergejs”, “antons”. Izdrukāt uz ekrāna tikai tos vārdus, kuros ir atrodams burts “a” vai “ā”. Šim nolūkam var izmantot string metodi Contains.
    public static void findNamesWithA() {

        String[] names = {"jānis", "pēteris", "andris", "sergejs", "antons"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("a") || names[i].contains("ā")) {
                System.out.println("contains a or ā " + names[i]);
            }
        }
    }
}