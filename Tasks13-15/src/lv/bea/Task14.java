package lv.bea;

//Task 14
//Mums ir ūdens 3L un 5 trauki atbilstoši ar tilpumu 1,2,4,6,8 L. Mūsu programmai ir jānosaka un jāizvada uz ekrāna, kuros traukos šo ūdeni mēs varam ieliet.

public class Task14 {
    static void traukuUzd() {

        int[] containers = {1, 3, 4, 6, 8};
        int liters = 3;


        for (int i = 0; i < containers.length; i++) {
            if(containers[i] >= liters){
                System.out.println("liters fit in "+containers[i]);
            }
        }




    }

}
