package lv.bea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//task 1
//Izveidot consoles aplikāciju, kura uz ekrāna izdrukās jūsu vārdu un uzvārdu.

        System.out.println("Beatrise Mazjane");


//task 2
//Deklarēt programmā 4 mainīgos, katru ar savu datu tipu (int, double, bool, string). Diviem no viņiem piešķirt vērtību uzreiz pie deklarēšanas, 2 vēlāk programmā. Izdrukāt piešķirtās vērtības uz ekrāna.

        int fizz = 4;
        String animal = "cat";
        boolean truth;
        double basket;

        truth = true;
        basket = 5.5;

        System.out.println(fizz+" "+ animal+" "+truth+" "+basket);

//task 3
//Izveidot console aplikāciju. Deklarēt programmā divus int tipa mainīgos x un y. Piešķirt mainīgajiem vērtības 10 un 15. Deklarēt mainīgo z un piešķirt tam mainīgo x un y summu. Izdrukāt uz ekrāna mainīgā z vērtību.

        int x = 10;
        int y = 15;

        var z = x + y;
        System.out.println(z);

//task 4
// Izveidot Console aplikāciju, kura paprasa lietotājam vārdu un izvada to uz ekrāna.

        Scanner input = new Scanner(System.in);

        System.out.println("enter your name: ");

        var name3 = input.nextLine();

        System.out.println(name3);

// task 5
//Izveidot consoles aplikāciju, kura lietotājam paprasa vārdu un uzvārdu. Izdrukāt vārdu un uzvārdu formātā “Vārds Uzvārds”. Modificēt programmu tā, lai vārds un uzvārds tiktu izdrukāts formātā “V. Uzvārds”.

        Scanner sc = new Scanner(System.in);

        System.out.println("enter name: ");
        var name4 = input.nextLine();

        System.out.println("enter surname: ");
        var surname4 = input.nextLine();

        System.out.println(name4.substring(0, 1).toUpperCase() + name4.substring(1) + " " + surname4.substring(0, 1).toUpperCase()+ surname4.substring(1));


        StringBuilder sb = new StringBuilder();

        sb.append(name4.substring(0,1).toUpperCase());
        sb.append(". ");
        sb.append(surname4.substring(0, 1).toUpperCase()+ surname4.substring(1));

        System.out.println(sb.toString());

    }
}
