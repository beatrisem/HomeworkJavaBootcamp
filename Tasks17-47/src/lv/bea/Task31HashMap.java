package lv.bea;

import java.util.HashMap;
import java.util.Map;

public class Task31HashMap {

//Task 31
//Izveidot console aplikāciju. Nodeklarēt string tipa masīvu ar (n) vārdiem. Programmai ir jāsaskaita, cik vārdi sākas ar katru atrasto burtu. Piemēram, mums ir saraksts ar vārdiem Jānis, Juris, Gatis, Gundars, Andris - rezultātā mums ir jāiegūst J=2, G=2, A=1

    public static void firstLetterCounter() {
        String[] names = {"Jānis", "Juris", "Gatis", "Gundars", "Andris"};
        System.out.println(names);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            char firstLetter = names[i].charAt(0);
            sb.append(firstLetter);
        }

        String firstLetterChars = sb.toString();
        char[] chars = firstLetterChars.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char i : chars) {
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1 : j + 1);
        }
        for (Map.Entry<Character, Integer> val : map.entrySet()) {
            System.out.println(val.getKey() + "=" + val.getValue());
        }

    }

}
