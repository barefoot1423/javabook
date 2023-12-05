package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    private static List<Student1> list = Arrays.asList(
        new Student1("Hong", "Man", 90),
        new Student1("Kim", "Woman", 92),
        new Student1("Joe", "Woman", 95),
        new Student1("Cho", "Man", 100)
    );

    public static double avg(Predicate<Student1> predicate) {
        int count = 0, sum = 0;
        for (Student1 student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }

        return (double) sum / count;
    }


    public static void main(String[] args) {
        double mailAvg = avg(t -> t.getSex().equals("Man"));
        System.out.println("average score of men : " + mailAvg );

        double femailAvg = avg(t ->π t.getSex().equals("Woman"));
        System.out.println("average score of women : " + femailAvg );
    }

}
