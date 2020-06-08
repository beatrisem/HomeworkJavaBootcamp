package lv.bea;

public class Animal {


    private String name;
    private String species;
    private int legs;
    private int age;
    private String owner;

    public Animal(String name, String species, int legs, int age, String owner) {
        this.name = name;
        this.species = species;
        this.legs = legs;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", legs=" + legs +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
