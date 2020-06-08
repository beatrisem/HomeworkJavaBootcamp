package lv.bea;

public class ToDoTask61 {

    //Task 61
    //Izveidot jaunu enum (WeekDayEnum), nedēļas dienām. Izveidot jaunu klasi ToDo, kurā ir proprties: Name, Description, WeekDay (šis properties ir ar datu tipu WeekDayEnum), Done (bool). Izveidot sarakstu, kurā glabāsies visi ToDo ieraksti. Pievienot šim sarakstam vairākus ToDo ierakstus. Izmantojot LINQ atrast visus ierakstus kuri vēl nav padarīt. Izmantojot LINQ atrast visus ierakstus, kuri jāizdara konkrētā nedēļas dienā.


    public String name;
    public String description;
    public WeekDayEnumTask61 weekDayEnumTask61;
    public boolean done;


    public ToDoTask61(String name, String description, WeekDayEnumTask61 weekDayEnumTask61, boolean done) {
        this.name = name;
        this.description = description;
        this.weekDayEnumTask61 = weekDayEnumTask61;
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weekDayEnum=" + weekDayEnumTask61 +
                ", done=" + done +
                '}';
    }




}

