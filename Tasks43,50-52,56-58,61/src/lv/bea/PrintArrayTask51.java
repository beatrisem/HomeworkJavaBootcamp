package lv.bea;

import java.util.Arrays;

public class PrintArrayTask51 {

    //uzd51
    //Izveidot metodi PrintArrayValues, kura kā parametru saņem int[] un izdrukā visas tā vērtības. Izmantojot metožu overload funkciju definēt metodi PrintArrayValues, kura kā parametru saņem string[] un var izdrukāt string[] visas vērtības.

    private int[] values;
    private String[] values2;

    public PrintArrayTask51(int[] values) {
        this.values = values;
        System.out.println(Arrays.toString(values));
    }

    public PrintArrayTask51(String[] values2) {
        this.values2 = values2;
        System.out.println(Arrays.toString(values2));
    }
}
