package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

    private static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Sin", 95, 93));

    public static void printString(Function<Student, String> function) {
        for (Student s : list) {
            System.out.println(function.apply(s) + " ");
        }
    }

    public static void printInt(ToIntFunction<Student> function) {
        for (Student s :
            list) {
            System.out.println(function.applyAsInt(s) + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Student's name");
        printString(t->t.getName());

        System.out.println("Student's English Score");
        printInt(t->t.getEnglishScore());

        System.out.println("Student's Math Score");
        printInt(t->t.getMathScore());

    }

}
