package lv.bea;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


//Task 52
//Definēt programmas sākumā string[] ar vērtībām {“Jānis”, ””, “Pēteris”, “Antons”, “”, “Andris”}. Izveidot metodi GetNonEmtyArray, kura kā paramatru saņem string[] un lietotājam atgriež string[], kurā vairs nav tukšo vērtību. Lai nodemonstrētu GetNonEmptyArray metodes darbību, izmantojiet metodi PrintArrayValues, kura vispirms izdrukā sākotnējā masīva vērtības, bet vēlāk masīvu, kurā vairs nav tukšās vērtības.

public class GetNonEmptyArrayTask52 {

    String [] beginNames;

    public GetNonEmptyArrayTask52(String[] beginNames) {
        this.beginNames = beginNames;
        ArrayList<String> endNames = new ArrayList();

        for (int i = 0; i < beginNames.length ; i++) {
            if(!beginNames[i].isEmpty()){
                endNames.add(beginNames[i]);
            }
        }

        System.out.println(endNames);
        System.out.println(Arrays.toString(beginNames));
    }








}
