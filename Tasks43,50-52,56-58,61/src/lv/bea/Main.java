package lv.bea;

import lv.tester.GetOnlySmallValues;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static lv.bea.CalculateSumTask50.CalculateSum;
import static lv.bea.WeekDayEnumTask61.MONDAY;

public class Main {

    public static void main(String[] args) {


        //Task43

        List<PersonTask43> persons = new ArrayList<>();

        persons.add(new PersonTask43("Kristofers", 22));
        persons.add(new PersonTask43("Andris", 47));
        persons.add(new PersonTask43("Valdis", 36));
        persons.add(new PersonTask43("Laura", 15));

        ArrayList<PersonTask43> olderPersons = new ArrayList<>();

        for (var person : persons) {
            if (person.age > 30) {
                olderPersons.add(person);
            }

        }
        System.out.println(olderPersons.toString());


        //Task 50

        new PrintNameSurnameTask50("nav", "ir");

        new PrintArrayTask51(new int[]{2, 3, 4, 5, 6});
        new PrintArrayTask51(new String[]{"one", "two", "three"});


        String[] nameValues = {"Jānis", "", "Pēteris", "Antons", "", "Andris"};
        new GetNonEmptyArrayTask52(nameValues);

        System.out.println(CalculateSum(2, 5));
        System.out.println(CalculateSum(72, 5));

        GetOnlySmallValues.GetOnlySmallValues(new int[]{3, 6, 8, 9, 10, 1});

// uzd 56. arraylist enter name
//Izveidot tukšu string sarakstu (List). Izmantojot console applikāciju paprasīt lietotājam ievadīt vārdu. Ievadītais vārds ir jāpievieno sarakstam. Programmai ir jāļauj ievadīt 1...n vārdus. Ir jābūt iespējai izdrukāt ievadītos vārdus.

        List<String> array = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter your name: ");
            String name = sc.nextLine();
            array.add(name);

            System.out.println("another name? Y/N");
            if (sc.nextLine().equals("Y")) {
                continue;
            } else {
                break;
            }
        }

        System.out.println(array);


        //Task57
        //Definēt int masīvu, kura lielums ir 10. No koda piešķirt visiem masīva elementiem vērtības. Var izmantot Math.Random metodi.

        int[] val = new int[10];

        for (int i = 0; i < 10 ; i++) {
        val[i] = (int) (Math.random() * 100);
        System.out.println(val[i]);
    }


        //Task 58

        CarTask58 car1 = new CarTask58("BUICK", "RENDEZVOUS", 90000, "black", 2005);
        CarTask58 car2 = new CarTask58("BMW", "R1100RS ABS", 251532, "red", 2001);
        CarTask58 car3 = new CarTask58("HARLEY DAVIDSON", "VRSCDX NIGHT ROD SPECIALS", 45000, "black", 2010);
        CarTask58 car4 = new CarTask58("KENWORTH", "T800", 5032, "white", 2006);
        CarTask58 car5 = new CarTask58("LINCOLN", "MKZ", 45678, "black", 2009);

        List<CarTask58> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        //stream metode atrast lielāko val price
        Comparator<CarTask58> comparePrice = comparing(CarTask58::getPrice);
        CarTask58 maxPrice = carList.stream().max(comparePrice).get();
        System.out.println(maxPrice);

        List<CarTask58> comparePrice2 = carList.stream().sorted(comparing(CarTask58::getPrice).reversed()).collect(Collectors.toList());
        System.out.println(comparePrice2);


        //Task 61

        ToDoTask61 t1 = new ToDoTask61("clean", "wash kitchen", MONDAY, false);
        ToDoTask61 t2 = new ToDoTask61("call", "call friend", WeekDayEnumTask61.TUESDAY, false);
        ToDoTask61 t3 = new ToDoTask61("watch", "watch tv", MONDAY, true);

        List<ToDoTask61> toDos = Arrays.asList(t1, t2, t3);

        var result = toDos.stream()
                .filter(t -> t.done == false)
                .collect(Collectors.toList());

        var result2 = toDos.stream()
                .filter(w -> {
                    return w.weekDayEnumTask61 == MONDAY;
                })
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result2);


    }
}
