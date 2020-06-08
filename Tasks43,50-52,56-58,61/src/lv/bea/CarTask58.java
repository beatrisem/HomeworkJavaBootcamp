package lv.bea;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class CarTask58 {


//Task 58
//Izveidot klasi Car ar 5 property(īpašībām) Make, Model, Price un Color, Year, izvēlieties atbilstošus datutipus izveidotajiem laukiem. Pievienojiet šai klases public metodi, kura atgriež visu informāciju par mašīnu kā tekstu, kur visas vērtības ir atdalītas ar komatu. Galvenajā programmā izveidojiet sarakstu ar 5 mašīnām. Atrodiet un izdrukājiet uz ekrāna dārgākās mašīnas informāciju. Dārgākās mašīnas atrašanai varat izmantot gan LINQ, gan parastu for vai foreach ciklu.

    private String make;
    private String model;
    private int price;
    private String color;
    private int year;


    public CarTask58(String make, String model, int price, String color, int year) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public int getPrice() {
        return price;
    }

}
