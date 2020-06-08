package lv.bea;

public class Task37 {

//uzd37
//Definēt int masīvu ar 10 elementiem { 1, 56, 77, 89, 34, 22, 2, 3, 4, 8 }. Drukājam vērtības console logā, tik ilgi kamēr sastopam vērtību 22. Pēc vērtības 22 sasniegšanas cikls ir jāpārtrauc.

    public static void stopAt22() {
        int[] values = {1, 56, 77, 89, 34, 22, 2, 3, 4, 8};
        for (int i : values) {
            if (i == 22) {
                break;
            }
            System.out.println(i);
        }
    }
}