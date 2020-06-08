package lv.bea;

public class KitchenTableTask63 extends TableTask63 {
    private int persons;

    public KitchenTableTask63(double height, double width, double length) {
        super(height, width, length);
    }

    public int extension(int persons){
        switch (persons){
            case 4:
                setLength(getLength()*1.5);
                break;

            case 8:
                setLength(getLength()*2);
                break;

            case 16:
                setLength(getLength()*3);
                break;
        }
this.persons = persons;
        return persons;

    }

    public void shrink(int times){
        switch (times){
            case 2:
                setLength(getLength()/2);
                break;
            case 4:
                setLength(getLength()/4);
                break;
        }
    }
    @Override
    public String toString() {
        return "KitchenTable{" + "persons " + persons + "," +
                super.toString();
    }

}
