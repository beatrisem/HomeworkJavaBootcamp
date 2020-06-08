package lv.bea;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//Task 62


        ToDoTask62 toDo1 = new ToDoTask62("clean", "clean window");
        toDo1.MarkAsDone(false);

        System.out.println(toDo1);


//Task 63

        KitchenTableTask63 table1 = new KitchenTableTask63(1, 0.80, 1.5);
        table1.extension(8);
        KitchenTableTask63 table2 = new KitchenTableTask63(1, 0.80, 1.5);
        table2.extension(4);
        KitchenTableTask63 table3 = new KitchenTableTask63(1, 0.80, 2.5);
        table2.shrink(4);

        List<TableTask63> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);


        List<TableTask63> byLength = tables.stream()
                .filter(t -> t.getLength() > 1.5)
                .collect(Collectors.toList());


        System.out.println(byLength);

//Task 60
        ChairTask60 chair1 = new ChairTask60("red", 4.4,1);
        ChairTask60 chair2 = new ChairTask60("blue", 3,4);
        ChairTask60 chair3 = new ChairTask60("black", 2.4,4);

        List<ChairTask60> chairs = Arrays.asList(chair1, chair2, chair3);

        var result = chairs.stream()
                .filter(s->s.color.contains("ed"))
                .findAny();

        if(result.isPresent()){
            System.out.println(result.get().color);
        }


//Task 81
        var result81 = readFromFile();
        System.out.println(result81);
    }




        public static PersonTask81 readFromFile() {
            Path path = Paths.get("/Users/edvins/temp/test.json");
            try {
                String json = Files.readAllLines(path).get(0);
                Gson gson = new Gson();
                return gson.fromJson(json, PersonTask81.class);

            } catch (IOException e) {
                e.printStackTrace();
            }

        return null;



    }

}
