package lv.bea;
//78 uzd par multilevel inheritence - Dog extends animal, Diary extends Dog
//Izveidot vienu piemēru ar Multilevel inheritance, abstrakcija pēc izvēles.
public class Diary extends Dog {
    private String dayActivities;

    public Diary(String name, String species, int legs, int age, String owner, String breed, String dayActivities) {
        super(name, species, legs, age, owner, breed);
        this.dayActivities = dayActivities;
    }

    public String getDayActivities() {
        return dayActivities;
    }

    public void setDayActivities(String dayActivities) {
        this.dayActivities = dayActivities;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "dayActivities='" + dayActivities + '\'' +
                super.toString()+'}';
    }
}
