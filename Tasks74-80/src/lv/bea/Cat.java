package lv.bea;

public class Cat extends Animal {
//Task 80 Class dog and cat extends animal
//Izveidot vienu piemēru ar Hierarchical inheritance, abstrakcija pēc izvēles.

    private String type;

    public Cat(String name, String species, int legs, int age, String owner, String type) {
        super(name, species, legs, age, owner);
        this.type = type;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\''+
                '}'+ super.toString() ;
    }
}
