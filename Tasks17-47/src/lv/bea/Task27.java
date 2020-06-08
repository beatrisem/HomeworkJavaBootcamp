package lv.bea;

public class Task27 {

// Task27
// Izveidot console aplikāciju, kurā ir definēts string tipa masīvs ar cilvēku vārdiem. Izmantojot do while ciklu izdrukāt visus vārdus.

    public static void forEachCycleNames() {

        String[] names = {"anna", "janis", "toms", "velma"};
        int i = 0;
        do {
            System.out.println(names[i]);
            i++;
        } while (i < names.length);
    }
}