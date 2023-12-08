package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("java8 lamda", "stream mapping");

        inputList1.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(s -> System.out.println(s));

        List<String> inputList2 = Arrays.asList("10, 20, 30, 40, 50, 60");
        List<Integer> collect = inputList2.stream().flatMap(s -> Arrays.stream(s.split(","))).map(s -> s.trim()).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        System.out.println(collect.toString());
    }

}
