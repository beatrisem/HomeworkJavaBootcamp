package lv.bea;

import java.util.Scanner;

import static lv.bea.Task14.traukuUzd;
import static lv.bea.Task13.egleMethod;

public class Main {

    public static void main(String[] args) {

    egleMethod();


    traukuUzd();



        Scanner sc = new Scanner(System.in);
        System.out.println("TRUE or FALSE : want lunch?");
        String answer = sc.nextLine();
        var a = Boolean.parseBoolean(answer);

        if(a == true){
            System.out.println("Jūsu pusdienas ir gatavas");
        }else if(!a){
            System.out.println("Jums pusdienas nebūs");
        }else{
            System.out.println("nepareiza atbilde");
        }


    }


}
