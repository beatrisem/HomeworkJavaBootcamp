package lv.bea;

public class PrintNameSurnameTask50 {

//Task 50
//Izmantojot metožu overload iespējas definēt metodi PrintNameSurname, kura vienā gadījumā strādā ar vienu ieejas parametru name, bet otrajā gadījumā ar diviem parametriem name un surname. Pēc veiksmīga rezultāta sasniegšanas modificēt metodi PrintNameSurname, tā, lai tai būtu tikai divi parametri un ja lietotājs nav ievadījis uzvārdu, tad uzvārda vietā rakstītos teksts “Nezināms”.

private String name;
private String surname;

    public PrintNameSurnameTask50(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println(name+ " "+ surname);
    }

    public PrintNameSurnameTask50(String name) {
        this.name = name;
        this.surname = "nezināms";
        System.out.println(name+" "+surname);
    }

}
