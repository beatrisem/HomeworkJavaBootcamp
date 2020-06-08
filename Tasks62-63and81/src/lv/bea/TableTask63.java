package lv.bea;

//Task63
//Izveidot klasi Table. Tai ir jābūt tādiem properties, kā Height, Width utt.. Izveidot divas jaunas klases KitchenTable un StudyTable. Abām šīm klasēm ir jāmantojas no klases Table. Papildināt klasi KitchenTable un StudyTable tikai ar tām piemītošām īpašībām (properties). Piemēram, virtuves galds var būt paplašināms, ka to var izmantot 4 vai 8 cilvēki. Paplašināšanas rezultātā,tai mainās izmēri. Šo paplašināšanu vai samazināšanu var izdarīt tikai izsaucot metodi Extend vai Shrink. Tikai šīs metodes drīkst mainīt galda izmēru. Paplašiniet klasi StudyTable, piemēram, mācību galdos parasti ir šūplādes. Pamatprogrammā uztaisīt vairākus galdus, gan mācību gan virtuves. Pievienojiet viņus vienam sarakstam. Izmantojot LINQ atrodiet galdus, kuru izmērs atbilst jums interesējošajam.

public class TableTask63 {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double width;
    private double length;

    public TableTask63(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

}
