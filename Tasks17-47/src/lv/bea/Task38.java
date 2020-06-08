package lv.bea;

public class Task38 {
    public static void nameMaker() {
//Task 38
//Ir definēti divi string tipa masīvi, pirmajā masīvā atrodas cilvēku vārdi, otrajā cilvēku uzvārdi. Abu masīvu lielums ir identisks (10 ieraksti). Izveidot tādu programmu, kur Vārdi un Uzvārdi tiek apvienoti vienā masīvā un izdrukāti uz ekrāna.


    String[] firstNames = {"Jānis", "Juris", "Gatis", "Gundars", "Andris", "Jānis", "Juris", "Gatis", "Gundars", "Andris"};
    String[] surnames = {"Berzs", "Liepa", "Kalns", "Egle", "Priede", "Berzs", "Liepa", "Kalns", "Egle", "Priede"};
    String[] fullNames = new String[10];
        for (int i = 0; i < firstNames.length; i++) {
            for (int j = 0; j < surnames.length; j++) {
                fullNames[i] = firstNames[i] + surnames[i];
            }
            System.out.println(fullNames[i]);
        }
    }
}
