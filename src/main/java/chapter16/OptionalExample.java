package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(33);

        double asDouble = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(asDouble);
    }

}
