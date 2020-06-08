package lv.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetOnlySmallValues {
    public static List<Integer> GetOnlySmallValues(int[] values) {

        List<Integer> smallerValues = new ArrayList<>();
        for (var value : values) {
            if (value < 5) {
                smallerValues.add(value);
            }
        }

        System.out.println(smallerValues);
        return smallerValues;
    }

}
