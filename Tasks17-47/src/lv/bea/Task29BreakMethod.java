package lv.bea;

public class Task29BreakMethod {
//Task29
//Izveidot int masīvu ar vērtībām 1,1,1,0,1,1,1, 1. Programmai ir jāpārtrauc darbs, kad atrodam 0. Izmantojam break;

    public static void breakMethod() {
        int[] masivs = {1, 1, 1, 0, 1, 1, 1, 1};

        for (int i = 0; i < masivs.length; i++) {
            if (masivs[i] > 0) {
                System.out.println(masivs[i]);
            } else {
                break;
            }

        }
    }
}
