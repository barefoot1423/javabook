package chapter16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Tom");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        names.forEach(System.out::println);

        names.parallelStream().forEach(p -> System.out.println(Thread.currentThread().getName()));
    }

}
