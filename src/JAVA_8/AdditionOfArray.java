package JAVA_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionOfArray {
    public static void main(String[] args) {
        List<Integer> ok = new ArrayList<>();
        ok.add(10);
        ok.add(20);
        ok.add(30);
        ok.add(40);

        int Sumofnumber = ok.stream().collect(Collectors.summingInt(s -> s));
        System.out.println(Sumofnumber);

    }
}
