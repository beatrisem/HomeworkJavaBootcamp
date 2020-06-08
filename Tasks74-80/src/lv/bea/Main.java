package lv.bea;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      //  78uzd dog un 79 multilevel inheritence
      //  Izveidot vienu piemēru ar Single inheritance, abstrakciju varat izvēlēties pašu.

        Dog dog1 = new Dog("shery", "dog", 4, 9, "anna", "jack russel");
        System.out.println(dog1);

        Diary shery = new Diary("shery", "dog", 4, 9, "anna", "jack russel", "run and play outside");
        System.out.println(shery);

        Cat cat1 = new Cat("berry", "cat", 4, 4, "lara", "tiger");
        System.out.println(cat1);


//Task 77 Write class to file
//Izdomāt savu klasi ar vismaz 5 īpašībām. Ierakstīt sarakstu ar šiem objektiem failā un pēc tam izvadīt sarakstu ar visiem objektiem no faila uz ekrāna. Izmantot GSON package un json faila formātu.

        Animal animal1 = new Animal("bob", "racoon", 4, 9, "micha");
        Animal animal2 = new Animal("marve", "hedgehog", 4, 3, "vaira");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);

        System.out.println(animals);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (Writer writer = new FileWriter("C:\\temp\\animalHomework.json")) {
            gson.toJson(animals, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Reader reader = new FileReader("C:\\temp\\animalHomework.json");
            Type listType = new TypeToken<List<Animal>>() {
            }.getType();
            List<Animal> animalsAgain = gson.fromJson(reader, listType);
            System.out.println(animalsAgain.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
