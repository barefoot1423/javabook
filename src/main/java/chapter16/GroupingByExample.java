package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
            new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Pusan),
            new Student("신용권", 10, Student.Sex.MALE, Student.City.Pusan),
            new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Seoul)
        );

        Map<Student.Sex, List<Student>> mapBySex = totalList.stream().collect(Collectors.groupingBy(Student::getSex));
        System.out.println(mapBySex.toString());

        Map<Student.City, List<String>> collect = totalList.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(collect.toString());

        System.out.println(collect.get(Student.City.Pusan));
        System.out.println(collect.get(Student.City.Seoul));

        Map<Student.Sex, Double> collect1 = totalList.stream().collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));
        System.out.println(collect1.toString());
    }

}
