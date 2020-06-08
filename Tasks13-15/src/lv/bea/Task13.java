package lv.bea;

//Task 13
//Jūs esat ziemassvētku tirdziņā nopirkuši eglīti, eglīti raksturo trīs parametri augstums, zaru diametrs un eglītes veids (tradicionālā eglīte vai sudrabegle). Eglītes parametri var tikt definēti gan kā mainīgie programmā, gan tos var paprasīt arī lietotājam. Atkarībā no eglītes augstuma, zaru diametra vai eglītes tipa, to ir jānovieto atbilstošā telpā mājā. Ja eglīte ir sudrabegle, to drīkst novietot tikai kamīnzālē.
//
//Augstums (cm) Zaru diamtrs (cm) Telpa
//50 <= x < 100 100 <= y < 150 Viesistaba 1
//100 <= x < 150 150 <= y < 200 Viesistaba 2
//150 <= x <= 300 200 <= y <= 300 Kamīnzāle


public class Task13 {

    static void egleMethod() {

        var x = 60;
        var y = 120;
        var sudrabegle = 1;
        var parasta = 2;
        int egle = 2;


        if (egle == sudrabegle){
            System.out.println("Kamīnzāle");
        } else if(50 <= x && x < 100 ) {
            if (100 <= y && y < 150) {
                System.out.println("Viesistaba 1");
            }
        } else if (100 <= x && x < 150) {
            if (150 <= y && y < 200) {
                System.out.println("Viesistaba 2");
            }
        } else if (150 <= x && x <= 300) {
            if (200 <= y && y <= 300) {
                System.out.println("Kamīnzāle");
            }
        }else{
            System.out.println("Kamīnzāle");
        }

    }
}
