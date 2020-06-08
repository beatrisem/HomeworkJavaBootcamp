package lv.bea;

public class Task19 {
    public static void firstLast() {

//Task 19
//Izveidot console aplikāciju, kurā ir definēts int masīvs ar vērtībām 100, 200, 233, 66, 77, 98.
//Izdrukāt uz ekrāna pirmā un pēdējā elementa vērtības.

        int[] value =  {100, 200, 233, 66, 77, 98};
        System.out.println("first " + value[0] + " last "+ value[value.length-1]);
    }
}
