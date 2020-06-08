package lv.bea;
import java.util.Arrays;


//Task 81
//Izveidot klasi, kura atbilst objektam, kurš aprakstīts failā. Ielādēt šo objektu no faila.

public class PersonTask81 {

    String name;
    String surname;
    int id;
    int[] grades;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }



    public PersonTask81(String name, String surname, int id, int[] grades) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grades = grades;
    }
}

