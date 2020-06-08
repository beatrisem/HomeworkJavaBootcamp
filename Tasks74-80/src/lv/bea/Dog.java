package lv.bea;

//Task 80 Class dog and cat extends animal
//Izveidot vienu piemēru ar Hierarchical inheritance, abstrakcija pēc izvēles.
public class Dog extends Animal {

    private String breed;

    public Dog(String name, String species, int legs, int age, String owner, String breed) {
        super(name, species, legs, age, owner);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}'+ super.toString();
    };


}
