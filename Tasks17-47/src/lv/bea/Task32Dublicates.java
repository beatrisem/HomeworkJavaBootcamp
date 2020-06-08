package lv.bea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task32Dublicates {
//Task32
//Uzrakstīt programmu, kas no masīva izmet visus duplikātus - vērtības, kas atkārtojas vairāk kā vienu reizi. Piemērs [“ABC”,”CDE”,”FGA”,”CDE”,”GAE”,”ABC”,”ABO”] -> [“ABC”,”FGA”,”CDE”,”GAE”,”ABO”]

    public static void dublicates(){
        String[] dubs = {"ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO"};
        ArrayList<String> notDubs = new ArrayList<String>();
        notDubs.add(dubs[0]);
        boolean doesItHaveDub = false;

        for (int i = 1; i < dubs.length-1; i++) {
            for (int j = 0; j < notDubs.size(); j++) {


                if (dubs[i].equals(dubs[j])) {
                    doesItHaveDub = true;
                }
            }

            if (doesItHaveDub == false) {
                notDubs.add(dubs[i]);
            }

            doesItHaveDub = false;
        }

        System.out.println(Arrays.toString(dubs));
        System.out.println(Arrays.toString(notDubs.toArray()));



















    }
}
