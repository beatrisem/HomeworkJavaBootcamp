package lv.bea;
// uzd43
//Uztaisīt Person klasi ar divam īpašībām Name un Age.
//Pamatprogrammā izveidot personu sarakstu ar 4 personām.
//Atrast visas personas, kuras vecākas par 30 gadiem un pārkopēt tās jaunā sarakstā.


public class PersonTask43 {
    private String name;
    public int age;


    public PersonTask43(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
}
}
