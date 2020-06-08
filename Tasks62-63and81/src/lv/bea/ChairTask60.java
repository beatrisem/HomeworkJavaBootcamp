package lv.bea;

//Task 60
//Izveidot klasi Chair, un pievienot tai atbilstošus properties (piemēram, augstums, krāsa utt.). Pamatprogrammā uztaisīt vairākus šīs klases objektus. Pievienot visus šos objektus sarakstā. Izmantojot LINQ sameklēt tikai konkrētu objektu.

public class ChairTask60 {
    public String color;
    public double height;
    public int legs;

    public ChairTask60(String color, double height, int legs) {
        this.color = color;
        this.height = height;
        this.legs = legs;
    }
}
